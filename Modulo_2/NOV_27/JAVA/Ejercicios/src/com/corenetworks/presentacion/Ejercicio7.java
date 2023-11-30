package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su renta en meses");
        int tiempoMeses = sc.nextInt();
        if(tiempoMeses <= 24){
            System.out.println("Redito es 5%");
        }else if(tiempoMeses > 24 && tiempoMeses <= 60){
            System.out.println("Redito es 8%");
        }else{
            System.out.println("Redito es 10%");
        }
    }
}
