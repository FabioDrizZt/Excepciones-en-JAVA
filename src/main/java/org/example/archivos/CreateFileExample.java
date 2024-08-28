package org.example.archivos;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File myFile = new File("nuevoArchivo.txt");
            if (myFile.createNewFile()) {
                System.out.println("Archivo creado: " +
                        myFile.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }
}
