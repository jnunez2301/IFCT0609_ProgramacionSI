package com.corenetworks.persistencia;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoFunciones extends Conexion{
    public int probarFuncion() throws SQLException, ClassNotFoundException {
        CallableStatement sentencia = null;
        ResultSet rejilla = null;
        String sql = "SELECT cantidades_existencia();";
        int resultado = 0;
        abrirConexion();
        sentencia = miConexion.prepareCall(sql);

        rejilla = sentencia.executeQuery();
        if(rejilla.next()){
            resultado = rejilla.getInt("cantidades_existencia");
        }
        return resultado;
    }
    public String nombreProducto(int id) throws SQLException, ClassNotFoundException {
        CallableStatement sentencia = null;
        ResultSet rejilla = null;
        String sql = "SELECT nombre_producto(?)";
        String resultado = null;

        abrirConexion();

        sentencia = miConexion.prepareCall(sql);
        sentencia.setInt(1, id);

        rejilla = sentencia.executeQuery();
        if(rejilla.next()){
            resultado = rejilla.getString("nombre_producto");
        }
        return resultado;
    }

}
