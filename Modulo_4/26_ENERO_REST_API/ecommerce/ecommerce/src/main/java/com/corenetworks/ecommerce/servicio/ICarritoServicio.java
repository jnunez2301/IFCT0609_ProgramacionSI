package com.corenetworks.ecommerce.servicio;

import com.corenetworks.ecommerce.modelo.Carrito;

import java.util.List;

public interface ICarritoServicio {
    Carrito insertar(Carrito c1);
    Carrito modificar(Carrito c1);
    void eliminar(int id);
    Carrito obtenerUno(int id);
    List<Carrito> obtenerTodos();
}
