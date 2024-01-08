package com.corenetworks.presentacion;

import com.corenetworks.persistencia.Conexion;
import com.corenetworks.persistencia.ConexionLibros;

import java.sql.SQLException;

public class ProbarConexión {
    public static void main(String[] args) {
        ConexionLibros c1 = new ConexionLibros();
        try {
            System.out.println(c1.obtenerLibrosPorAutor("12345678A"));
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
