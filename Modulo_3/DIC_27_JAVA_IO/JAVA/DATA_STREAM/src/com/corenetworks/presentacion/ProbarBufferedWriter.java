package com.corenetworks.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProbarBufferedWriter {
    public static void main(String[] args) {
        FileWriter fSalida = null;
        BufferedWriter buffer = null;

        try {
            fSalida = new FileWriter("bufffered_writer_ejemplo.txt");
            buffer = new BufferedWriter(fSalida);
            buffer.write("Escrito en el buffer");
            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
