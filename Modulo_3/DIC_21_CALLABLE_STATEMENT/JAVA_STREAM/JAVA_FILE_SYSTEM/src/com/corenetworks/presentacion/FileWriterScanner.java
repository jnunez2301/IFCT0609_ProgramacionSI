package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea = null;
        System.out.println("Escriba la línea ->");
        linea = sc.nextLine();

        try {
            FileWriter salida = new FileWriter(linea);
            salida.write(linea);
            salida.flush();
            salida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        sc.close();
    }
}
