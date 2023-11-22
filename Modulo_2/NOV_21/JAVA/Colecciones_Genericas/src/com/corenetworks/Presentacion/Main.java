package com.corenetworks.Presentacion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(9);
        numeros.add(7);
        System.out.println(numeros);
        System.out.println("Tiene el 8? -> " + numeros.contains(8));
        numeros.remove(2);
        System.out.println(numeros);
        for(Integer elemento: numeros){
            System.out.println(elemento);
        }
    }
}
