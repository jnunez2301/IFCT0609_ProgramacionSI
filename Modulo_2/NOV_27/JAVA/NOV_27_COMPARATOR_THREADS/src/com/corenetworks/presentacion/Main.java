package com.corenetworks.presentacion;

import com.corenetworks.comparator.ClienteSimple;
import com.corenetworks.comparator.ComparadorNif;
import com.corenetworks.comparator.ComparadorNombre;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ComparadorNombre c = new ComparadorNombre();
        ComparadorNif nif = new ComparadorNif();
        TreeSet arbol = new TreeSet(c);
        /*
        Cliente c1 = new Cliente("Jonathan", "1D", 3_000);
        Cliente c2 = new Cliente("Moises", "1D", 3_000);
        Cliente c3 = new Cliente("Pedro", "3D", 4_000);
        Cliente c4 = new Cliente("Maria", "4D", 5_000);
        Cliente c5 = new Cliente("Pablito", "0D", 1_000);

        */

        arbol.add(new ClienteSimple("Juan", 1_500, "1111-A"));
        arbol.add(new ClienteSimple("Jose", 1_200, "3333-B"));
        arbol.add(new ClienteSimple("Maria", 1_200, "2222-C"));
        arbol.add(new ClienteSimple("Laura", 1_100, "0000-D"));

        Object[] array = arbol.toArray();

        for(Object elemento: arbol){
            System.out.println(elemento);
        }

    }
}
