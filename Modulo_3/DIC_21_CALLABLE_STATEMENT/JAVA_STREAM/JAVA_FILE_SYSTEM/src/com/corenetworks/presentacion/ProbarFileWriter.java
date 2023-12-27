package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;

public class ProbarFileWriter {
    public static void main(String[] args) {
        String nombreFichero = "salida.txt";
        try {
            FileWriter fSalida = new FileWriter(nombreFichero);
            fSalida.write("EScribiendo desde java en un ficheron plano");
            fSalida.flush();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
