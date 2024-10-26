package ex.exceptions;

public class Quiz5 {
    public static void main(String[] args) {
        secondMethod();
    }

    private static void secondMethod() {
        try {
            firstMethod();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    private static void firstMethod() {
        new RuntimeException();
    }
}
