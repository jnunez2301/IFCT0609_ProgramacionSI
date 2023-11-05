package com.corenetworks.presentacion;

import com.corenetworks.modelo.Mensaje;

import java.util.Scanner;

public class probarMensaje {
    public static void main(String[] args) {
        Mensaje msj = new Mensaje();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su saludo ");
        msj.setSaludo(sc.nextLine());

        System.out.println("Ingrese su ip de origen");
        msj.setIpOrigen(sc.next());

        System.out.println("Ingrese su ip de destino");
        msj.setIpDestino(sc.next());

        System.out.println(msj.mostrarInfo());

        sc.close();
    }
}
