package com.corenetworks.persistencia;

import com.corenetworks.modelo.Libro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConexionLibros extends Conexion {
    public List<Libro> obtenerLibrosPorAutor(String dni) throws ClassNotFoundException, SQLException {
        //1.Declarar variables
        PreparedStatement sentencia;
        List<Libro> resultado = new ArrayList<>();
        ResultSet rejilla;
        String sql = "Select la.isbn, titulo, la.dni from libros l inner join libros_autores la on l.isbn = la.isbn where la.dni = ?";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1,dni);
        //4. Consultar
        rejilla = sentencia.executeQuery();
        while (rejilla.next()){
            resultado.add(new Libro(
                    rejilla.getString("isbn"),
                    rejilla.getString("titulo")
            ));
        }
        //5. Devolver el resultado
        return resultado;
    }
}
