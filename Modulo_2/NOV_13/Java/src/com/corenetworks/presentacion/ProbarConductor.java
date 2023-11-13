package com.corenetworks.presentacion;

import com.corenetworks.modelo.Coche1;
import com.corenetworks.modelo.Conductor;

public class ProbarConductor {
    public static void main(String[] args) {
        Coche1 c1 = new Coche1(100);
        Conductor c2 = new Conductor(c1); // Coche implementa IVehiculo por lo tanto es uno

        System.out.println(c2.conducir());

    }

}
