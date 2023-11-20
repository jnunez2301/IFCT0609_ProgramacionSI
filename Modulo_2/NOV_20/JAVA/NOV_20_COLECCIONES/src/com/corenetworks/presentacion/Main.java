package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet(); // Sin usar polimorfismo
        Set conjunto1 = new HashSet(); // Recomendable usar polimorfismo
        System.out.println(conjunto1.isEmpty());
        conjunto1.add("Casa");
        System.out.println(conjunto1);
        conjunto1.add("Jardin");

        System.out.println(conjunto1);
        System.out.println(conjunto1.contains("Jardin"));
        System.out.println("Número de elementos -> " + conjunto1.size());

        conjunto1.add("Silla");
        conjunto1.add("Mesa");
        conjunto1.add(10);
        System.out.println(conjunto1);
        // HashSet no acepta repetidos y el orden es aletorio

        Empleado e1 = new Empleado(1);
        conjunto1.add(e1);
        System.out.println(conjunto1);
        conjunto1.remove(e1);
        System.out.println(conjunto1);
    }
}
