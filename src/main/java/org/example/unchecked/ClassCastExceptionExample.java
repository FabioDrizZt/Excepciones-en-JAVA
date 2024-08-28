package org.example.unchecked;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = "Hola, mundo!";
        try {
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Error de conversión de clase: " + e.getMessage());
        }
    }
}
