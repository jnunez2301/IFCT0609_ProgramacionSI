package com.corenetworks.presentacion;

import com.corenetworks.modelo.Persona;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProbarFileWriter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        try {
            FileWriter fSalida = new FileWriter("segundo_ejemplo.txt");
            fSalida.write("NOMBRE"+ "-".repeat(25) +"EDAD" + "-".repeat(25) + "NOTA\n");
            String nombre = null;
            double nota = 0;
            double totalNotas = 0;
            double totalEdades = 0;

            String frase = null;
            int edad = 0;
            for(int i = 0; i < 5; i++){
                System.out.println("Ingrese el nombre");
                nombre = sc.nextLine();

                System.out.println("Ingrese la edad");
                edad = sc.nextInt();

                System.out.println("Ingrese la nota");
                nota = sc.nextDouble();

                sc.nextLine();

                personas.add(new Persona(nombre, edad, nota));
                totalNotas += nota;
                totalEdades += edad;
                frase = String.format("%-20s \t \t \t %d \t \t \t %.2f \n", personas.get(i).getNombre(), personas.get(i).getEdad(), personas.get(i).getNota());

                fSalida.write(frase);
            }
            double promedioNotas = totalNotas / personas.size();
            double promedioEdades = totalEdades / personas.size();
            fSalida.write("Promedio de notas\n " + promedioNotas + "\n");
            fSalida.write("Promedio de edades\n " + promedioEdades+ "\n");
            fSalida.flush();
            fSalida.close();
            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
