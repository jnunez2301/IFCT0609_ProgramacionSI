package com.corenetworks.presentacion;

import com.corenetworks.presentacion.modelo.Persona;

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
            fSalida.write("NOMBRE"+ "-".repeat(25) +"EDAD\n");
            String nombre = null;
            String frase = null;
            int edad = 0;
            for(int i = 0; i < 2; i++){
                System.out.println("Ingrese el nombre");
                nombre = sc.nextLine();

                System.out.println("Ingrese la edad");
                edad = sc.nextInt();
                sc.nextLine();
                personas.add(new Persona(nombre, edad));
                frase = String.format("%-20s \t \t \t %d \n", personas.get(i).getNombre(), personas.get(i).getEdad());

                fSalida.write(frase);
            }
            fSalida.flush();
            fSalida.close();
            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
