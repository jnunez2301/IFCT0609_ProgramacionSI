package com.corenetworks.ejercicios.presentacion;

import com.corenetworks.ejercicios.modelo.*;

public class ProbarCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jhon","00000F");
        ClienteDao cDao = new ClienteDao();
        IDAO ad1 = new AccesoDesarollo();
        IDAO ap1 = new AccesoProduccion();

        cDao.setConexion(ad1);
        System.out.println(cDao.insertar(c1));

        cDao.setConexion(ap1);
        System.out.println(cDao.insertar(c1));
        /*
        System.out.println(ad1.insertar(c1));
        System.out.println(ap1.insertar(c1));
        */

    }
}
