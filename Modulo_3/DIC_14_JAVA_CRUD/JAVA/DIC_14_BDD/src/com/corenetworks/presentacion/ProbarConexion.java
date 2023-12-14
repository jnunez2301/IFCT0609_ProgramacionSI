package com.corenetworks.presentacion;

import com.corenetworks.persistencia.AccesoProducto;
import com.corenetworks.persistencia.Conexion;

import java.sql.SQLException;

public class ProbarConexion {
    public static void main(String[] args) {
        AccesoProducto ap1 = new AccesoProducto();
        try{
            System.out.println(ap1.obtainAll());
        }
        catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
