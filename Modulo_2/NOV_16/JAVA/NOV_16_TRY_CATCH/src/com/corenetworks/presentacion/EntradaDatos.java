package com.corenetworks.presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        int dato;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un dato númerico");
        try{
            dato = sc.nextInt();
        }catch (InputMismatchException e1){
            System.out.println("Se esperaba un dato númerico");
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
        }

    }
}
