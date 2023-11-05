package com.corenetworks.examen.Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        String ip = "192.168.2.";
        //Iterar sobre la ip teniendo en cuenta que la máscara de subred es 255.255.255.0
        System.out.println("Las direcciones host posibles son: ");
        for(int i = 0; i <= 255; i++){
            System.out.println(ip + i);
        }

    }
}
