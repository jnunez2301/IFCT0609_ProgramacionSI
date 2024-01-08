package com.corenetworks.presentacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProbarPrintWriter2 {
    public static void main(String[] args) {
        File fSalida;
        PrintWriter altoNivel;
        try {
            fSalida = new File("print_writer.txt");
            altoNivel = new PrintWriter(fSalida);
            altoNivel.println("Escrito desde un PrintWriter");
            altoNivel.format("El nombre del producto %s tiene un precio %.2f y hay %d unidades",
                    "Te tai", 1.333, 50);
            altoNivel.flush();
            altoNivel.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
