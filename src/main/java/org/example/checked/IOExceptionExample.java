package org.example.checked;

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("archivo_nexistente.txt");
            BufferedReader reader = new BufferedReader(file);
            reader.readLine();
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
