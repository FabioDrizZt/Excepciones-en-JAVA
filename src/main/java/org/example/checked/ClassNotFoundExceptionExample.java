package org.example.checked;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.ejemplo.ClaseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
    }
}
