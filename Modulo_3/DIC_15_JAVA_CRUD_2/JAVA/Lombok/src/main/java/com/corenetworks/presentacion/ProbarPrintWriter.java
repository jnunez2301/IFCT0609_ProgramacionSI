package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProbarPrintWriter {
    public static void main(String[] args) {
        // 1. Declaración de variables
        FileWriter fSalida;
        PrintWriter altoNivel;
        try {
            fSalida = new FileWriter("print_writer.txt");
            altoNivel = new PrintWriter(fSalida);
            altoNivel.println("Escrito desde un PrintWriter");
            altoNivel.format("El nombre del producto %20s tiene un precio %.2f y hay %d unidades",
                    "Te tai", 1.333, 50);
            altoNivel.flush();
            altoNivel.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
