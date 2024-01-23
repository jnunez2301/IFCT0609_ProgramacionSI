package com.corenetworks.hibernacion.servicio;

import com.corenetworks.hibernacion.modelo.Patron;

import java.util.List;

public interface IPatronServicio {
    Patron insertar(Patron p1);
    Patron modificar(Patron p1);
    void eliminar(String dniPatron);
    Patron obtenerUno(String dniPatron);
    List<Patron> obtenerTodos();
}
