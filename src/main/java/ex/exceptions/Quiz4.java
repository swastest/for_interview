package ex.exceptions;

public class Quiz4 {
    public static void main(String[] args) {
        System.out.println(method());
    }

    private static int method() {
        try {
            int i = 5;
            return i;
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            return 6;
        }
    }
}
