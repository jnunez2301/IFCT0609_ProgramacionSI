package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ProbarListGenerico {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        Empleado e1 = new Empleado(3);

        empleados.add(new Empleado(1));
        empleados.add(new Empleado(2));
        empleados.add(e1);
        empleados.add(e1);
        System.out.println(empleados.set(0, e1));
        System.out.println(empleados);


    }
}
