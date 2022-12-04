import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class C4_SpringTx {

    @Service
    public static class Service1 {

        @Transactional
        public void doInTransaction() {
            insert1();
            insert2(); // <-- Will fail.
            insert3();
        }

        public void superMethod() {
            this.doInTransaction();
        }

        private void insert3() {

        }

        private void insert2() {
            throw new RuntimeException();
        }

        private void insert1() {

        }
    }

    @Service
    public static class Service2 {

        @Autowired
        private Service1 service1;

        public void superMethod() {
            service1.superMethod();
        }
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericApplicationContext();
        Service2 service2 = applicationContext.getBean(Service2.class);
        service2.superMethod();
    }
}
