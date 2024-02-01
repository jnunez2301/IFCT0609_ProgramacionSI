package com.corenetworks.cardinalidades.Repaso.servicio;

import com.corenetworks.cardinalidades.Repaso.modelo.Editorial;

import java.util.List;

public interface IEditorialServicio {
    Editorial crear(Editorial e);
    Editorial modificar(Editorial e);
    void eliminar(int id);
    Editorial consultarUno(int id);
    List<Editorial> consultarTodos();

    List<Editorial> filtroPorDireccion(String direccion);

    List<Editorial> filtroPorNombre(String nombre);
}
