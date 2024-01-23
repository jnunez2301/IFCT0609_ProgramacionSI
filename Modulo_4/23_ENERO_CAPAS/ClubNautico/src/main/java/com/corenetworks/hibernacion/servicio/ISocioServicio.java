package com.corenetworks.hibernacion.servicio;

import com.corenetworks.hibernacion.modelo.Socios;

import java.util.List;

public interface ISocioServicio {
    Socios insertar(Socios s2);
    Socios modificar(Socios s2);
    void eliminar(String id);
    Socios obtenerUno(String id);
    List<Socios> obtenerTodos();
}
