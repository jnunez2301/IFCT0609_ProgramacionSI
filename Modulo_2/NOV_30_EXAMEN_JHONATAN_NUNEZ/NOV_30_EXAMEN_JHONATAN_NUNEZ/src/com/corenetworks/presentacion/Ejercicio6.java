package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Ejercicio6 {
    public static void main(String[] args) {



        // Calcular la edad en años de una persona que nació el 30 de Agosto de 1992
        LocalDate fechaNacimiento = LocalDate.of(1992, 8, 30);
        LocalDate fechaActual = LocalDate.now();
        Period restoFecha = Period.between(fechaNacimiento, fechaActual);
        System.out.println("Tiene " + restoFecha.getYears() + " años");
        // Añadir dos meses a la fecha de inicio del curso 09/10/2023
        LocalDate inicioCurso = LocalDate.of(2023, 10, 9);
        System.out.println("Después de dos meses del inicio del curso es -> " + inicioCurso.plusMonths(2));
        // Mostrar la fecha de hoy
        System.out.println("La fecha de hoy es -> " + fechaActual);
    }
}
