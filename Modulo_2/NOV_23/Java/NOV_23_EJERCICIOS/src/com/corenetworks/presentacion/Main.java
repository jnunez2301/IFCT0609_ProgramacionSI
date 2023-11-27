package com.corenetworks.presentacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Hasta 2 años: exento
        // Entre 2 y 5 años: anual
        // Más de 5 años: semestral
        float tiempo;
        System.out.println("Número de años de su turismo");
        tiempo = sc.nextFloat();
        if(tiempo < 2){
            System.out.println("Exento");
        }else if(tiempo > 2 && tiempo <= 5){
            System.out.println("Anual");
        }else{
            System.out.println("Semestral");
        }
    }
}