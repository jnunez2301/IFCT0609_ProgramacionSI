package com.corenetworks.ProyectoCapas.servicio;

import com.corenetworks.ProyectoCapas.modelo.Pedidos;
import com.corenetworks.ProyectoCapas.repositorio.IPedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServicioImp implements IPedidoServicio{
    @Autowired
    private IPedidoRepositorio repositorio;
    @Override
    public Pedidos insertar(Pedidos p) {
        return repositorio.save(p);
    }

    @Override
    public Pedidos modificar(Pedidos p) {
        return repositorio.save(p);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }

    @Override
    public Pedidos obtenerUno(int id) {
        return repositorio.findById(id).orElse(new Pedidos());
    }

    @Override
    public List<Pedidos> obtenerTodos() {
        return repositorio.findAll();
    }
}
