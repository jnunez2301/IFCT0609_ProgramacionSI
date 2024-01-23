package com.corenetworks.ProyectoCapas.servicio;

import com.corenetworks.ProyectoCapas.modelo.Pedidos;

import java.util.List;

public interface IPedidoServicio {
    Pedidos insertar(Pedidos p);
    Pedidos modificar(Pedidos p);
    void eliminar(int id);
    Pedidos obtenerUno(int id);

    List<Pedidos> obtenerTodos();
}
