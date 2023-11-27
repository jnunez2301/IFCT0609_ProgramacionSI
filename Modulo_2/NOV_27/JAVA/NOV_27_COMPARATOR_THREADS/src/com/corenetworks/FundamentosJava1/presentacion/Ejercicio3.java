package com.corenetworks.FundamentosJava1.presentacion;

import com.corenetworks.FundamentosJava1.modelo.Ejercicio3.Persona;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        Persona p1 = new Persona(24);
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona(24));
        lista.add(new Persona(30));
        lista.add(new Persona(55));

        for(Persona elemento: lista){
            System.out.println(elemento + elemento.edadDias() + elemento.edadSegundos());
        }
    }
}
