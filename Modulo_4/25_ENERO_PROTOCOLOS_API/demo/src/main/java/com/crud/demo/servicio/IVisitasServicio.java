package com.crud.demo.servicio;

import com.crud.demo.modelo.Visitas;

import java.util.List;

public interface IVisitasServicio {
    Visitas insertar(Visitas v1);
    Visitas modificar( Visitas v1);
    void eliminar(int id);
    Visitas obtenerUno(int id);
    List<Visitas> obtenerTodos();
}
