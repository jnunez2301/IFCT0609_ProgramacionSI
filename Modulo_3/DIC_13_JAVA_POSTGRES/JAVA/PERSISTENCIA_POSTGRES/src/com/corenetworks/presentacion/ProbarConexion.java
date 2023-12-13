package com.corenetworks.presentacion;

import com.corenetworks.persistencia.AccesoProducto;
import com.corenetworks.persistencia.Conexion;
import java.sql.SQLException;

public class ProbarConexion {
    public static void main(String[] args) {
        /*
        Debido a que en AccesoProducto ya usamos abrirConexion() es innecesario este paso

        Conexion c1 = new Conexion();

        try{
            c1.abrirConexion();
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }catch(SQLException e){
            System.out.println(e.toString());
        }*/
        AccesoProducto aP1 = new AccesoProducto();
        try{
            System.out.println(aP1.obtener1(5));
            System.out.println(aP1.obtenerTodos());
        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }
}