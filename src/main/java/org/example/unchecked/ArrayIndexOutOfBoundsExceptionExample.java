package org.example.unchecked;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de los límites: " + e.getMessage());
        }
    }
}
