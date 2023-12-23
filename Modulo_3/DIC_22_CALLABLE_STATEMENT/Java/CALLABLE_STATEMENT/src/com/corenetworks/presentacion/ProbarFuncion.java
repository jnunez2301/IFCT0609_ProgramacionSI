package com.corenetworks.presentacion;

import com.corenetworks.modelo.Categorias;
import com.corenetworks.persistencia.AccesoFunciones;

import java.sql.SQLException;

public class ProbarFuncion {
 public static void main(String[] args) {
        AccesoFunciones ac1 = new AccesoFunciones();
        Categorias c1 = new Categorias(100, "C_Java");
        try {
            // Funcion personalizada
            // System.out.println(ac1.probarFuncion());
            // GetNombre
            // System.out.println(ac1.nombreProducto(10));
            // Insert
            // System.out.println(ac1.addProduct(c1));
            // Delete
            //System.out.println(ac1.removeProduct(c1));
            System.out.println(ac1.obtenerTodos());
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
    }
}
