public class C3_Exceptions {

    public static class Ex1 extends RuntimeException {
    }

    public static class Ex2 extends RuntimeException {
    }

    public static class Ex3 extends RuntimeException {
    }

    public static void main(String[] args) {
        try {
            throw new Ex1();
        } catch (RuntimeException e) {
            throw new Ex2();
        } finally {
            throw new Ex3();
        }
    }
}
