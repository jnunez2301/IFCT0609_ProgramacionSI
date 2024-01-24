package com.crud.demo.servicio;

import com.crud.demo.modelo.Conductores;

import java.util.List;

public interface IConductorServicio {
    Conductores insetar(Conductores c1);
    Conductores modificar(Conductores c1);
    void eliminar(String dni);
    Conductores obtenerUno(String dni);
    List<Conductores> obtenerTodos();
}
