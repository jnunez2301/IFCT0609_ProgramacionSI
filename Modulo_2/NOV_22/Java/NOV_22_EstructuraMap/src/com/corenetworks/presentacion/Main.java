package com.corenetworks.presentacion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map tabla = new HashMap();
        tabla.put("01293D", "Jhon Nunez");
        System.out.println(tabla);
        tabla.put("09394F", "Moises Zuniga");
        System.out.println(tabla);
        System.out.println(tabla.get("09394F"));
        System.out.println(tabla.get("01293D"));
        System.out.println(tabla.keySet());
        System.out.println(tabla.values());

        // MAP ACOTADO
        Map<Integer, String> tablaAlumnos = new HashMap<>();
        // KEY | VALUE
        tablaAlumnos.put(1, "Jonathan Nunez");
        tablaAlumnos.put(2, "Moises Zuniga");
        System.out.println(tablaAlumnos);
        System.out.println(tablaAlumnos.get(1));
        System.out.println(tablaAlumnos.get(2));
        System.out.println(tablaAlumnos.values());
        System.out.println(tablaAlumnos.keySet());
        System.out.println("Todos los datos de un set " + tablaAlumnos.entrySet());

        //Estructura para almacenar como un diccionario
        //La palabra puede tener varias definiciones
        Map<String, Set<String>> diccionario = new HashMap<>();
        String palabra = "banco";
        Set<String> definiciones = new HashSet<>();
        definiciones.add("Mueble para sentarse");
        definiciones.add("Institución para la gestión del dinero");
        definiciones.add("Agrupación de peces");
        diccionario.put(palabra, definiciones);
        System.out.println(diccionario.entrySet());
        definiciones.clear();
        definiciones.add("Método informático en el que se realiza un bucle en lenguajes de programación");
        definiciones.add("Objeto dibujado comunmente en papel para orientarse");
        diccionario.put("Map", definiciones);
        System.out.println(diccionario.entrySet());
    }
}
