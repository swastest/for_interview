import java.util.HashMap;
import java.util.Map;

public class C2_HashMap {

    public static class MyKey {

        @Override
        public int hashCode() {
            return 42;
        }
    }

    public static void main(String[] args) {
        MyKey k1 = new MyKey();
        MyKey k2 = new MyKey();

        Map<MyKey, String> map = new HashMap<>();
        map.put(k1, "String1");
        map.put(k2, "String2");

        System.out.println(map.get(k1));
        System.out.println(map.get(k2));
    }
}
