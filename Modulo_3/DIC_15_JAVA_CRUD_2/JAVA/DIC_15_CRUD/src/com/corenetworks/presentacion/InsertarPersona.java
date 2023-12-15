package com.corenetworks.presentacion;

import com.corenetworks.modelo.Persona;
import com.corenetworks.persistencia.AccesoEmpleados;

import java.sql.SQLException;

public class InsertarPersona {
    public static void main(String[] args) {
        AccesoEmpleados asc = new AccesoEmpleados();
        Persona p1 = new Persona("12354678D", "JUANITO", "Valladolid");
        try{
            /*asc.altaPersona(p1);*/
            asc.deletePersona(p1);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
