package org.example.unchecked;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            setEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido: " + e.getMessage());
        }
    }

    public static void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        System.out.println("Edad establecida: " + edad);
    }
}
