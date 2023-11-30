package com.corenetworks.FundamentosJava1.presentacion;

import com.corenetworks.FundamentosJava1.modelo.Ejercicio6.Numeros;

import java.util.ArrayList;
import java.util.TreeSet;

public class Ejercicio6 {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(40);
        numeros.add(50);
        numeros.add(10);
        System.out.println(Math.max(numeros));
    }
}
