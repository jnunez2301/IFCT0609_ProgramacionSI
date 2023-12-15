package com.corenetworks.presentacion;

import com.corenetworks.modelo.Clientes;
import com.corenetworks.persistencia.AccesoClientes;

import java.sql.SQLException;

public class ProbarClientes {
    public static void main(String[] args) {
        AccesoClientes ac1 = new AccesoClientes();
        Clientes c1 = new Clientes("ANDOR", "CORE_NETWORKS", "JOHN");
        Clientes c2 = new Clientes("ANDOR", "NETWORKS_CORE", "JOHN");
        try {
            // Obtener todos
            // System.out.println(ac1.obtenerTodos());
            // Obtener uno
            // System.out.println(ac1.obtenerUno("ANTON"));
            // Insertar uno
            System.out.println(ac1.insertarUno(c1));
            // Eliminar uno
            //System.out.println(ac1.eliminarUno("ANDOR"));
            // Actualizar nombre
            System.out.println(ac1.actualizarNombre(c2));
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
