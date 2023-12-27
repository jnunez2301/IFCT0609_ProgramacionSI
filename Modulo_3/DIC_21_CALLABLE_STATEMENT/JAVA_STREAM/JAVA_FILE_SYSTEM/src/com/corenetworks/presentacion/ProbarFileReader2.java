package com.corenetworks.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ProbarFileReader2 {
    public static void main(String[] args) {
        char[] buffer = new char[128];
        int caracterLeido;

        try {
            FileReader fEntrada = new FileReader("prueba1.txt");
            caracterLeido = fEntrada.read(buffer);
            // System.out.println("Caracteres leidos -> " + caracterLeido);
            // System.out.println(Arrays.toString(buffer));

            while (caracterLeido != -1){
                System.out.println("Entra al bucle");
                caracterLeido = fEntrada.read(buffer);
                System.out.println(Arrays.toString(buffer));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
