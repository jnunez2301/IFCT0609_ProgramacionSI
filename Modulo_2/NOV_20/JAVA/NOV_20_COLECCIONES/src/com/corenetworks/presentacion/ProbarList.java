package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ProbarList {
    public static void main(String[] args) {
        List lista = new ArrayList();
        // Mantiene el orden y se puede cambiar los elementos en este mismo.
        System.out.println("Numero de elementos -> " + lista.size());
        System.out.println("Esta vacia -> " + lista.isEmpty());
        lista.add("Casa");
        lista.add("Casa");
        System.out.println(lista);
        System.out.println("Contiene casa? " + lista.contains("Casa"));
        lista.add(7);
        System.out.println("Obtener elemento 0 -> " + lista.get(0));
        lista.set(0, "Piso");
        System.out.println(lista);
        lista.remove("Piso");
        System.out.println(lista);
        Empleado e1 = new Empleado(6);
        lista.add(e1);
        System.out.println(lista);
        // Recorrer la lista
        for(Object elemento: lista){
            System.out.println(elemento);
        }
    }
}
