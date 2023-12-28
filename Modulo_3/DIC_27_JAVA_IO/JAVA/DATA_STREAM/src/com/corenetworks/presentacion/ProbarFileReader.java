package com.corenetworks.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ProbarFileReader {
    public static void main(String[] args) {
        /*char[] buffer = new char[128];
        int longitudLeida = 0;
        try {
            FileReader fEntrada = new FileReader("segundo_ejemplo.txt");
            longitudLeida = fEntrada.read(buffer);
            System.out.println(Arrays.toString(buffer));
            System.out.println("La logintud leida es -> " + longitudLeida);
            fEntrada.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        try {
            FileReader fEntrada = new FileReader("segundo_ejemplo.txt");
            char[] buffer = new char[fEntrada.read()];
            int leido;

            while ((leido = fEntrada.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, leido));
            }
            fEntrada.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
