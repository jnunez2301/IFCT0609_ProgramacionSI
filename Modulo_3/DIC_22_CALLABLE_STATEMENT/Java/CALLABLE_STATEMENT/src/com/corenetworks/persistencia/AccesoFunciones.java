package com.corenetworks.persistencia;

import com.corenetworks.modelo.Categorias;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoFunciones extends Conexion{
    public List<Categorias> obtenerTodos() throws SQLException, ClassNotFoundException {
        Statement sentecia;
        ResultSet resultado;
        String sql = "SELECT category_id, category_name FROM categories;";
        List<Categorias> c1 = new ArrayList<>();

        abrirConexion();

        sentecia = miConexion.createStatement();
        resultado = sentecia.executeQuery(sql);
        while (resultado.next()){
            c1.add(new Categorias(
                    resultado.getInt("category_id"),
                    resultado.getString("category_name")
            ));
        }
        return c1;
    }
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
    public boolean addProduct(Categorias c1) throws SQLException, ClassNotFoundException {
        CallableStatement sentencia = null;
        String sql = "SELECT add_category(?, ?);";
        int resultado = 0;

        abrirConexion();

        sentencia = miConexion.prepareCall(sql);
        sentencia.setInt(1, c1.getCategory_id());
        sentencia.setString(2, c1.getCategory_name());
        resultado = sentencia.executeUpdate();
        return resultado > 0;
    }
    public boolean removeProduct(Categorias c1) throws SQLException, ClassNotFoundException {
        CallableStatement sentencia = null;
        String sql = "SELECT delete_category(?);";
        int resultado = 0;

        abrirConexion();

        sentencia = miConexion.prepareCall(sql);
        sentencia.setInt(1,c1.getCategory_id());

        resultado = sentencia.executeUpdate();

        return resultado > 0;
    }

}
