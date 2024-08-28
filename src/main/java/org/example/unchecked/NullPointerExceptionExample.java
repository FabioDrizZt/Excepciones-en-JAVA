package org.example.unchecked;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Referencia nula: " + e.getMessage());
        }
    }
}