package com.crud.demo.servicio;

import com.crud.demo.modelo.Autobuses;

import java.util.List;

public interface IAutobusesServicio {
    Autobuses insertar(Autobuses a1);
    Autobuses modificar(Autobuses a1);
    void eliminar(String matricula);
    Autobuses obtenerUno(String matricula);
    List<Autobuses> obtenerTodos();
}
