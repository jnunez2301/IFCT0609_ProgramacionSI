package com.corenetworks.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection miConexion;

    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                "jdbc:postgresql://dpg-cm42mci1hbls73aaqvn0-a.oregon-postgres.render.com/test_9c9g",
                "test_9c9g_user",
                "Jgd9X0EZJYSZidSOeeegSAUSr0ZWd4XE"
        );
        System.out.println("Connection opened successfully");
    }

    public Conexion(){}
}
