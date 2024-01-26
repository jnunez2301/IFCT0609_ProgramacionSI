package com.corenetworks.ecommerce.servicio;

import com.corenetworks.ecommerce.modelo.Carrito;
import com.corenetworks.ecommerce.repositorio.ICarritoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoServicio implements ICarritoServicio{
    @Autowired
    private ICarritoRepo repositorio;

    @Override
    public Carrito insertar(Carrito c1) {
        return repositorio.save(c1);
    }

    @Override
    public Carrito modificar(Carrito c1) {
        return repositorio.save(c1);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }

    @Override
    public Carrito obtenerUno(int id) {
        return repositorio.findById(id).orElse(new Carrito());
    }

    @Override
    public List<Carrito> obtenerTodos() {
        return repositorio.findAll();
    }
}
