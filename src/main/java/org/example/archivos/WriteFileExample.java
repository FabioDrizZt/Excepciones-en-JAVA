package org.example.archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("nuevoArchivo.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Este es un texto de ejemplo.");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
