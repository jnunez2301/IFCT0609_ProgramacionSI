package com.corenetworks.FundamentosJava1.modelo.Ejercicio3;

import java.time.Duration;
import java.time.LocalDate;

public class Persona {
    private int edad;
    // Entrada en años
    public Persona(){}

    public Persona(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Calcular edad en dias
    public String edadDias(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.minusYears(this.edad);
        Duration daysBetween = Duration.between(date2.atStartOfDay(), date1.atStartOfDay());
        return "\nTu edad es " + daysBetween.toDays() + " dias";
    }
    // Calcular edad en segundos
    public String edadSegundos(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.minusYears(this.edad);
        Duration secondsBetween = Duration.between(date2.atStartOfDay(), date1.atStartOfDay());
        return "\nTu edad es " + secondsBetween.toSeconds() + " segundos";
    }

}
