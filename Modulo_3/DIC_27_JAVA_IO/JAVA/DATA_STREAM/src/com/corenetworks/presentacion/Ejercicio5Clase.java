package com.corenetworks.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5Clase {
    public static void main(String[] args) {
        //1. Declarar variables
        FileWriter fSalida = null;
        BufferedWriter buffer = null;
        Scanner teclado = new Scanner(System.in);
        String frase = null;
        try {
            fSalida = new FileWriter("ejercicio5.txt");
            buffer = new BufferedWriter(fSalida);
            //2. Acciones e/S
            for(int i = 1; i <=5; i++){
                System.out.println("Escriba la frase " + i);
                frase = teclado.nextLine();
                buffer.write(frase+ "\n");

            }
            //3. Cerrar los flujos
            buffer.flush();
            buffer.close();
            fSalida.close();
            teclado.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
