package org.example.unchecked;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String numeroStr = "abc";
        try {
            int numero = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            System.out.println("Formato de número inválido: " + e.getMessage());
        }
    }
}
