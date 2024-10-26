package ex.exceptions;

import java.io.IOException;

public class Quiz3 {
    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            System.out.println("IOException");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }

    }

    private static void method() throws IOException {
        throw new IOException();
    }
}
