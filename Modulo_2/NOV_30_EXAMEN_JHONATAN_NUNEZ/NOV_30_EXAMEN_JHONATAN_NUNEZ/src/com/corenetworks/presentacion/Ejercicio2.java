package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Evaluar el valor de un número si es positivo o negativo o si es igual a 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = sc.nextInt();
        if(numero > 0){
            System.out.println("El número es positivo");
        } else if (numero == 0) {
            System.out.println("El número es igual a cero");
        }else{
            System.out.println("El número es negativo");
        }
        sc.close();
    }
}
