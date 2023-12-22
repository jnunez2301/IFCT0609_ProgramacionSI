package com.corenetworks.presentacion;

import com.corenetworks.persistencia.AccesoFunciones;

import java.sql.SQLException;

public class ProbarFuncion {
    public static void main(String[] args) {
        AccesoFunciones ac1 = new AccesoFunciones();
        try {
            System.out.println(ac1.probarFuncion());
            System.out.println(ac1.nombreProducto(10));
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
    }
}
