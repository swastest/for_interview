package ex.basic;

public class Quiz2 {

    public static void main(String[] args) {
        f(1);
    }

    private static void f(int i) {
        i = 1;
        i++;

        System.out.println(i);

        if (i == 5) {
            System.out.println("Exit...");
            System.exit(0);
        }

        f(i);
    }
}
