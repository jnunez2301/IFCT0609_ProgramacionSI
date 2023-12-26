package com.corenetworks.presentacion;

import com.corenetworks.modelo.Employee;
import com.corenetworks.persistencia.AccesoEmpleado;

import java.sql.SQLException;

public class PruebaEmpleado {
    public static void main(String[] args) {
        AccesoEmpleado ac1 = new AccesoEmpleado();
        Employee e1 = new Employee(101, "Zuniga", "Moises", 1);
        Employee e2 = new Employee(100, "SQL", "Java", 1);
        try {
            // Consulta
            // System.out.println(ac1.infoEmpleado(e1));
            // Insertar
            // System.out.println(ac1.insertarEmpleado(e1));
            // Eliminear
            // System.out.println(ac1.eliminarEmpleado(e1));
            // Actualizar
            // System.out.println(ac1.actualizarEmpleado(e1));
            System.out.println(ac1.empresaEmpleados());
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e.toString());
        }
    }
}
