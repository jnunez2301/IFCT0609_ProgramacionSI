package com.corenetworks.presentacion;

import com.corenetworks.modelo.Proveedor;

public class probarProveedor {
    public static void main(String[] args) {
        Proveedor prov = new Proveedor();
        prov.setIdProveedor(2);
        prov.setNombre("Pedro");
        prov.setTelefono(912123123);
        prov.setCantidadEmpleados(20);

        System.out.println("ID: " + prov.getIdProveedor()+
                "\nNOMBRE: " + prov.getNombre()
                + "\nTELÉFONO: " + prov.getTelefono()
                + "\nEMPLEADOS: " + prov.getCantidadEmpleados()
                );
    }

}
