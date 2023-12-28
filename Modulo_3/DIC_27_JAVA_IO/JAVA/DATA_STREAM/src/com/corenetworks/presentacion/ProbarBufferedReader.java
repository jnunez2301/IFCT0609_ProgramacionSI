package com.corenetworks.presentacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProbarBufferedReader {
    public static void main(String[] args) {
        //1. Declarar variables
        FileReader fEntrada=null;
        BufferedReader buffer=null;
        String linea = null;
        int contadorLinea = 0;
        //2. Acciones e/S
        try {
            fEntrada = new FileReader("buffered_writer_ejemplo.txt");
            buffer = new BufferedReader(fEntrada);
            while (true){
                linea = buffer.readLine();
                if(linea==null){
                    break;
                }
                System.out.println(linea);
                contadorLinea++;
            }
            //3. Cierres de los flujos
            System.out.println("El fichero tenía " + contadorLinea + " lineas");
            buffer.close();
            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
