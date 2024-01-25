package com.crud.demo.servicio;

import com.crud.demo.modelo.Autobuses;
import com.crud.demo.repositorio.IAutobusesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutobusesServicio implements IAutobusesServicio {
    @Autowired
    private IAutobusesRepo repositorio;

    @Override
    public Autobuses insertar(Autobuses a1) {
        return repositorio.save(a1);
    }

    @Override
    public Autobuses modificar(Autobuses a1) {
        return repositorio.save(a1);
    }

    @Override
    public void eliminar(String matricula) {
        repositorio.deleteById(matricula);
    }

    @Override
    public Autobuses obtenerUno(String matricula) {
        return repositorio.findById(matricula).orElse(new Autobuses());
    }

    @Override
    public List<Autobuses> obtenerTodos() {
        return repositorio.findAll();
    }
}
