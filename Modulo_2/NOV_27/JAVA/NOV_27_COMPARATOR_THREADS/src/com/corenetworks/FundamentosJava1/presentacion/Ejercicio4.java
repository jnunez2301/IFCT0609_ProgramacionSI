package com.corenetworks.FundamentosJava1.presentacion;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        int numero = sc.nextInt();
        if(numero % 2 == 0){
            System.out.println("Numero es par");
        }else{
            System.out.println("Numero es impar");
        }

    }
}
