package com.corenetworks.persistencia;

import com.corenetworks.modelo.Empleado;
import com.corenetworks.modelo.Persona;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoEmpleados extends Conexion{
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
    public boolean modificar(Empleado e1) throws SQLException, ClassNotFoundException {
        // Declarar variables
        Statement sentencia;
        int resultado = 0;
        String sql = "UPDATE employees SET first_name = '"+ e1.getNombre() + "' WHERE employee_id = '" + e1.getIdEmpleado() + "'";
        // Abrir la conexión
        abrirConexion();
        // Crear el Statement
        sentencia = miConexion.createStatement();
        // Modificar
        resultado = sentencia.executeUpdate(sql);
        // Devolver el resultado
        return resultado > 0;
    }
    public boolean eliminar(int id) throws SQLException, ClassNotFoundException {
        // Declarar variables
        Statement sentencia;
        int resultado = 0;
        String sql = "DELETE FROM employees WHERE employee_id = '" + id + "'";
        // Abrir la conexión
        abrirConexion();
        // Crear el Statement
        sentencia = miConexion.createStatement();
        // Modificar
        resultado = sentencia.executeUpdate(sql);
        // Devolver el resultado
        return resultado > 0;
    }
    // PreparedStatement
    public boolean alta(Empleado e1) throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "INSERT INTO employees (employee_id, last_name, first_name) VALUES(?, ?, ?);";
        abrirConexion();
        sentencia = miConexion.prepareStatement(sql);
        // Darle valor a los parámetros
        sentencia.setInt(1, e1.getIdEmpleado());
        sentencia.setString(2, e1.getApellidos());
        sentencia.setString(3, e1.getNombre());

        resultado = sentencia.executeUpdate();

        return resultado > 0;
    }
    // PreparedStatement
    public boolean prepareDelete(int id) throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "DELETE FROM employees WHERE employee_id = ?";
        abrirConexion();
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setInt(1, id);
        resultado = sentencia.executeUpdate();
        return resultado > 0;
    }
}
