package com.corenetworks.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection miConexion;
    public Conexion(){}
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                // 127.0.0.1 siempre pertenece al localhost
                "jdbc:postgresql://127.0.0.1:5432/Northwind2",
                "postgres", "jhon2301");
        System.out.println("Exito al abrir la conexión");
    }
}
