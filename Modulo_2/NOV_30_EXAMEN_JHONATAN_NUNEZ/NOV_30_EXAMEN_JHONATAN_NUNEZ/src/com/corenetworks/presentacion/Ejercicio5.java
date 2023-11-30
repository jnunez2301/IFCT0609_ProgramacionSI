package com.corenetworks.presentacion;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Nunca mates una mosca sobre la cabeza de un tigre.


        String frase = "Nunca mates una mosca sobre la cabeza de un tigre.";
        // Mostrar la cadena toda en mayúsculas
        System.out.println(frase.toUpperCase());
        // Mostrar la cadena en minúsculas
        System.out.println(frase.toLowerCase());
        // Mostrar solo la palabra "sobre"
        System.out.println(frase.substring(22, 27));
        // Mostrar la posición de la letra primera "m"
        System.out.println("La letra m aparece por primera vez en la posición -> "+frase.indexOf("m"));
        // Devolver la longitud de la cadena
        System.out.println("La longitud de la cadena de texto es -> " +frase.length());
    }
}
