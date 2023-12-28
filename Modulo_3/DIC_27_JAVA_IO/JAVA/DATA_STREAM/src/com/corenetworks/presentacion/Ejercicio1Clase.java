package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1Clase {
    public static void main(String[] args) {
        //1. Declarar variables
        FileWriter fSalida = null;
        Scanner teclado = new Scanner(System.in);
        String frase = null;
        try {
            fSalida = new FileWriter("segundo_ejemplo.txt");
            //2. Acciones e/S
            for(int i = 1; i <=5; i++){
                System.out.println("Escriba la frase " + i);
                frase = teclado.nextLine();
                fSalida.write(frase+ "\n");

            }
            //3. Cerrar los flujos
            fSalida.flush();
            fSalida.close();
            teclado.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
