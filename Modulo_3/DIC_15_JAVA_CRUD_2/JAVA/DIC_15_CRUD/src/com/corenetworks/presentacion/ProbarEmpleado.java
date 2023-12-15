package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;
import com.corenetworks.persistencia.AccesoEmpleados;

import java.sql.SQLException;

public class ProbarEmpleado {
    public static void main(String[] args) {

        AccesoEmpleados ap1 = new AccesoEmpleados();
        // Cambiar nombre
        try {
            System.out.println(ap1.modificar(new Empleado(1, "Mario Jose", "Nuñez Zuniga", 2)));
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.toString());
        }

        // Borrar empleado
        try {
            System.out.println(ap1.eliminar(100));
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Crear nuevo empleado
        try{
            System.out.println("Empleado dado de alta " + ap1.alta(new Empleado(100, "Jhonatan", "Nuñez Zuniga", 2)));
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Eliminar empleado con PreparedStatement
        try{
            System.out.println("Empleado eliminado " + ap1.prepareDelete(100));
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
