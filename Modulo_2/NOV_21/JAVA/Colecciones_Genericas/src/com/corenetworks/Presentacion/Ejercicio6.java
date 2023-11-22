package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.*;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Pasajero p1 = new Pasajero();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre");
        p1.setNombre(sc.nextLine());
        System.out.println("DNI");
        p1.setCedula(sc.nextLine());
        System.out.println("Ubicación en el avión\n" +
                "PASILLO - CENTRO- VENTANA");
        Ubicacion u1 = Ubicacion.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Tipo de Pasaje en el avión\n" +
                "EJECUTIVA - TURISTA");
        ClasePasaje c1 = ClasePasaje.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Número de asiento");
        int numeroAsiento = sc.nextInt();
        Silla s1 = new Silla(c1, u1, p1, numeroAsiento);
        Avion a1 = new Avion();
        if (c1.equals(ClasePasaje.EJECUTIVA)) {
            switch (u1) {
                case VENTANA:
                    a1.asignarAsientoEjecutivo(p1, Ubicacion.VENTANA);
                    break;
                case CENTRO:
                    a1.asignarAsientoEjecutivo(p1, Ubicacion.CENTRO);
                    break;
                case PASILLO:
                    a1.asignarAsientoEjecutivo(p1, Ubicacion.PASILLO);
                    break;
            }
        }
        if (c1.equals(ClasePasaje.TURISTA)) {
            switch (u1) {
                case VENTANA:
                    a1.asignarAsientoTurista(p1, Ubicacion.VENTANA);
                    break;
                case CENTRO:
                    a1.asignarAsientoTurista(p1, Ubicacion.CENTRO);
                    break;
                case PASILLO:
                    a1.asignarAsientoTurista(p1, Ubicacion.PASILLO);
                    break;
            }
            System.out.println(a1.toString());
        }


    }
}
