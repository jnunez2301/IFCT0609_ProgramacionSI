package com.crud.demo.servicio;

import com.crud.demo.modelo.Conductores;
import com.crud.demo.repositorio.IConductoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorServicio implements IConductorServicio{
    @Autowired
    private IConductoresRepo repositorio;

    @Override
    public Conductores insetar(Conductores c1) {
        return repositorio.save(c1);
    }

    @Override
    public Conductores modificar(Conductores c1) {
        return repositorio.save(c1);
    }

    @Override
    public void eliminar(String dni) {
        repositorio.deleteById(dni);
    }

    @Override
    public Conductores obtenerUno(String dni) {
        return repositorio.findById(dni).orElse(new Conductores());
    }

    @Override
    public List<Conductores> obtenerTodos() {
        return repositorio.findAll();
    }
}
