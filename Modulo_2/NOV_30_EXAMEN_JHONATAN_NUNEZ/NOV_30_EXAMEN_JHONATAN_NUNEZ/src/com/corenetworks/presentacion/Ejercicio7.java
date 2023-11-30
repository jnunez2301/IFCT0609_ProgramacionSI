package com.corenetworks.presentacion;

import com.corenetworks.modelo.Dado;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println(new Dado().lanzar());
        while(true){
            System.out.println("Quiere continuar s/n");
            cadena = sc.next();
            if(cadena.equals("s")){
                System.out.println(new Dado().lanzar());
            }else if(cadena.equals("n")){
                System.out.println("Juego finalizado");
                break;
            }else{
                System.out.println("Si desea finalizar el juego escriba n, si desea continuar s");
            }
        }
        sc.close();

    }
}
