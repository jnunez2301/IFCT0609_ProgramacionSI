package com.corenetworks.presentacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Crear un programa que introduciendo el nombre de un fichero (con su ruta completa nos de toda la información posible de el)
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del fichero con su extension");
        System.out.println("P.D: También puede ingresar su ruta completa");
        try(FileReader fr = new FileReader(sc.nextLine())){
            BufferedReader bf = new BufferedReader(fr);
            String sCadena;
            while((sCadena = bf.readLine()) !=null){
                System.out.println(sCadena);
                System.out.println("El fichero tiene una longitud de -> " + sCadena.length() + " caracteres");
            }
            bf.close();
            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
