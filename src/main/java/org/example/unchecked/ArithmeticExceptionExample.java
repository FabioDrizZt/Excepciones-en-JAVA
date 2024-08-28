package org.example.unchecked;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }
    }
}
