package ex.exceptions;

public class Quiz1 {
    public static void main(String[] args) {
        try {
            method();
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    private static void method() {
        throw new RuntimeException();
    }
}
