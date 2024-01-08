package com.corenetworks.presentacion;

import com.corenetworks.modelo.Contador;

public class ProbarContador {
    public static void main(String[] args) {
        System.out.println("Valor del contador " +  Contador.contador);
        Contador c1 = new Contador();
        System.out.println(c1.getNumeroSerie());
        Contador c2 = new Contador();
        System.out.println(c2.getNumeroSerie());

    }
}
