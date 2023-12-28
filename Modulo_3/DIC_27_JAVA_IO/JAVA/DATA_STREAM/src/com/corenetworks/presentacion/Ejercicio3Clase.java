package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3Clase {
    public static void main(String[] args) {
        //1. Declarar variables
        FileWriter fSalida = null;
        Scanner teclado = new Scanner(System.in);
        String nombre = null;
        int edad= 0, nota = 0;
        float acumuladoEdad = 0,acumuladoNota =0;

        String frase = null;
        try {
            fSalida = new FileWriter("cuarto_ejemplo.txt");
            fSalida.write("NOMBRE \t \t \tEDAD \t NOTA \n");
            fSalida.write("-".repeat(50)+ "\n");
            //2. Acciones e/S
            for(int i = 1; i <=3; i++){
                System.out.println("Escriba el nombre  " + i);
                nombre = teclado.nextLine();
                System.out.println("Escriba la edad " + i);
                edad = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Escriba la nota " + i);
                nota = teclado.nextInt();
                teclado.nextLine();
                frase = String.format("%-15s \t \t \t %d \t %d \n", nombre, edad, nota);
                fSalida.write(frase);
                //Operaciones para calcular el promedio
                acumuladoEdad +=edad;
                acumuladoNota += nota;

            }
            //3. Cerrar los flujos
            fSalida.write(String.format("El promedio de las edades es -> %.2f \n",acumuladoEdad/3));
            fSalida.write(String.format("El promedio de las notas es -> %.2f \n",acumuladoNota/3));
            fSalida.flush();
            fSalida.close();
            teclado.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
