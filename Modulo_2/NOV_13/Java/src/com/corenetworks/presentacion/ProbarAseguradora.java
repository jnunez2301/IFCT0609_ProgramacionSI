package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarAseguradora {
    public static void main(String[] args) {

        Coche c1 = new Coche("1234MAB","BMW");
        ITaller tMecanico = new TallerMecanico();
        SeguroCoche s1 = new SeguroCoche(tMecanico, "Mapfre");

        System.out.println(s1.repararCoche(c1));

        ITaller tPintura = new TallerPintura();
        s1.setTaller(tPintura);
        System.out.println(s1.repararCoche(c1));

    }
}