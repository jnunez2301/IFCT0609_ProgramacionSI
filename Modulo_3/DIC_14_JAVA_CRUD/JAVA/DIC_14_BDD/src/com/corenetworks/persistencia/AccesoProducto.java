package com.corenetworks.persistencia;

import com.corenetworks.modelo.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoProducto extends Conexion{
    public Producto obtener1(int id) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "SELECT product_id, product_name, unit_price, units_in_stock FROM products WHERE product_id = " + id;

        abrirConexion();

        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        if(resultado.next()){
            // Simplificado
            return new Producto(resultado.getInt("product_id"),resultado.getString("product_name"), resultado.getDouble("unit_price"),resultado.getInt("units_in_stock"));
        }
        return null;
    }
    public List<Producto> obtainAll() throws SQLException, ClassNotFoundException {

        // Abrir conexión
        Statement sentencia;
        ResultSet resultado;
        String sql = "SELECT product_id, product_name, unit_price, units_in_stock FROM products";
        abrirConexion();
        List<Producto> productos = new ArrayList<>();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        // En este caso hace bucle con todas las filas de la query
        while(resultado.next()){
            productos.add(new Producto(resultado.getInt("product_id"),
                    resultado.getString("product_name"),
                    resultado.getDouble("unit_price"),
                    resultado.getInt("units_in_stock")));
        }
        return productos;
    }
}