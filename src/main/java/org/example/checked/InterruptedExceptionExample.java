package org.example.checked;

public class InterruptedExceptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Hilo completado.");
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido: " + e.getMessage());
            }
        });

        thread.start();
        thread.interrupt(); // Interrumpir el hilo
    }
}
