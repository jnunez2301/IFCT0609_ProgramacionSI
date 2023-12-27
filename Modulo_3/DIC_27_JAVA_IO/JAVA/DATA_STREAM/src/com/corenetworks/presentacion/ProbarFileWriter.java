package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarFileWriter {
    public static void main(String[] args) {
        // Declarar Variables
        // Acciones e/s
        Scanner sc = new Scanner(System.in);
        System.out.println("Se le solicitará escribir 5 frases");
        try {
            FileWriter fSalida = new FileWriter("primer_ejemplo.txt");
            for(int i = 0; i < 5; i++){
                System.out.println("Escriba su frase");
                fSalida.write(sc.nextLine() + "\n");
            }
            fSalida.flush();
            // Cerrar los flujos
            fSalida.close();
            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
