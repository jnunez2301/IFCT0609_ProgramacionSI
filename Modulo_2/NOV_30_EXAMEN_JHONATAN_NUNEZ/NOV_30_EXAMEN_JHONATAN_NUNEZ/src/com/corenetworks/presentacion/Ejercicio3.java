package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // En base al número mostrar los siguientes valores
        /*
        * 1.Microcoche
        * 2.Automóviles compactos
        * 3.Automóvil ultra compacto
        * 4.Automóvil familiar
        * 5.Vehículo de lujo
        * 6.Automóvil deportivo
        * 7.Descapotable
        * 8.Todoterreno
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un coche del 1 al 8");
        int numero = sc.nextInt();
        switch (numero){
            case 1:
                System.out.println("Microcoche");
                break;
            case 2:
                System.out.println("Automóviles compactos");
                break;
            case 3:
                System.out.println("Automóvil ultra compacto");
                break;
            case 4:
                System.out.println("Automóvil familiar");
                break;
            case 5:
                System.out.println("Vehículo de lujo");
                break;
            case 6:
                System.out.println("Automóvil deportivo");
                break;
            case 7:
                System.out.println("Descapotable");
                break;
            case 8:
                System.out.println("Todoterreno");
                break;
            default:
                System.out.println("Por favor ingrese un valor entre el 1 al 8");
                break;
        }
    }
}
