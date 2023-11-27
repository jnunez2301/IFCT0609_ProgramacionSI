package com.corenetworks.FundamentosJava1.presentacion;

import com.corenetworks.FundamentosJava1.modelo.Ejercicio1.Monedas;

public class Ejercicio1 {
    public static void main(String[] args) {
        Monedas c1 = new Monedas(100, 100);
        System.out.println(c1.cambio(c1, 163.27));
    }

}
