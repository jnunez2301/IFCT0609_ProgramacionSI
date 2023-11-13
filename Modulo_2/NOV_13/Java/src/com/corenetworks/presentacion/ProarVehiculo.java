package com.corenetworks.presentacion;

import com.corenetworks.modelo.Coche1;
import com.corenetworks.modelo.Conductor;
import com.corenetworks.modelo.IVehiculo;

public class ProarVehiculo {
    public static void main(String[] args) {
        IVehiculo c1 = new Coche1(100);
        IVehiculo v1 = new Conductor();

        System.out.println(c1.moverse());
        System.out.println(v1.moverse());
        IVehiculo c2 = new Coche1(0);
        System.out.println(c2.moverse());

        Conductor cond1 = new Conductor(v1);
        System.out.println(cond1.conducir());


    }
}
