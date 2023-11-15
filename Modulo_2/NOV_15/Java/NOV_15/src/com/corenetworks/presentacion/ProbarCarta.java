package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarCarta {

    public static void main(String[] args) {
        Carta c1 = new Carta(Palo.CORAZONES, Numeros.AS);
        System.out.println(c1);
        Carta c2 = new Carta(Palo.CORAZONES, Numeros.AS);
        System.out.println(c2);
        System.out.println("Son iguales? " + c1.equals(c2));

        Baraja b1 = new Baraja();
        System.out.println(b1.toString());

    }
}

