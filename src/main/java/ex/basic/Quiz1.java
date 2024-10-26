package ex.basic;

public class Quiz1 {
    public static void main(String[] args) {
        for (byte b = 1; b < 130; b++) {
            if (b  == 128) {
                break;
            }
            System.out.println(b);
        }
    }
}
