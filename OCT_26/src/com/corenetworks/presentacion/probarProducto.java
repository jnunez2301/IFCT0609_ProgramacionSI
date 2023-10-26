package com.corenetworks.presentacion;

import com.corenetworks.modelo.Productos;

public class probarProducto {
    public static void main(String[] args) {
        Productos p1 = new Productos();
        p1.setIdProducto(5);
        p1.setNombre("ratón gris");
        p1.setCantidadExistencias(100);
        p1.setTelefono(612123123);
        p1.setCantidadEmpleados(350);
        System.out.println("El id es -> " + p1.getIdProducto());
        System.out.println("El nombre es -> " + p1.getNombre());
        System.out.println("Las cantidades en existencia son -> " + p1.getCantidadExistencias());
        System.out.println("Cantidad de empleados -> " + p1.getCantidadEmpleados());
        System.out.println("Telefono -> " + p1.getTelefono());
    }
}
