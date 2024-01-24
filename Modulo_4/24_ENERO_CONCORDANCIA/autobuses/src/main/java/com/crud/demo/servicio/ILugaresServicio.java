package com.crud.demo.servicio;

import com.crud.demo.modelo.Lugares;

import java.util.List;

public interface ILugaresServicio {
    Lugares insertar(Lugares l1);
    Lugares modificar(Lugares l1);
    void eliminar(int id);
    Lugares obtenerUno(int id);
    List<Lugares> obtenerTodos();
}
