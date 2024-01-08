package com.corenetworks.modelo;

import jdk.jfr.DataAmount;
import lombok.Getter;

@DataAmount
@Getter
public class Contador {
    public static int contador;
    private int numeroSerie;
    public Contador(){
        contador++;
        numeroSerie = contador;
        // es lo mismo que arriba
        //numeroSerie= ++contador;
    }
}
