package com.corenetworks.FundamentosJava1.presentacion;

import com.corenetworks.FundamentosJava1.modelo.Ejercicio2.TiposDato;

public class Ejercicio2 {
    public static void main(String[] args) {
        TiposDato t1 = new TiposDato("cadena", 1, true, 1_000.34, 3.4f);
        System.out.println(t1.toString());
    }

}
