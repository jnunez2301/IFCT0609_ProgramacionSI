package com.corenetworks.persistencia;

import com.corenetworks.modelo.Persona;
import com.corenetworks.modelo.Socio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoPersonas extends Conexion{
    public Boolean altaPersona(Persona p1) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        int resultado = 1;
        String sql = "INSERT INTO personas VALUES('" + p1.getDNI() + "', '" + p1.getNombre() + "', '" + p1.getDireccion() + "')";

       /* INSERT INTO personas
        VALUES('12345678D', 'PEDRO', 'MONTE PERDIDO');*/
        abrirConexion();

        sentencia = miConexion.createStatement();
        resultado = sentencia.executeUpdate(sql);

        return resultado > 0;
    }
    public Boolean deletePersona(Persona p1) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        int resultado;
        String sql = "DELETE FROM personas WHERE DNI = '" + p1.getDNI() + "'";
        abrirConexion();

        sentencia = miConexion.createStatement();
        resultado = sentencia.executeUpdate(sql);

        return resultado > 0;
    }
}
