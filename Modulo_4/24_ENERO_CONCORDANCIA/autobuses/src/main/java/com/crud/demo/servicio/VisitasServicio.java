package com.crud.demo.servicio;

import com.crud.demo.modelo.Visitas;
import com.crud.demo.repositorio.IVisitasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitasServicio implements IVisitasServicio{
    @Autowired
    private IVisitasRepo repositorio;
    @Override
    public Visitas insertar(Visitas v1) {
        return repositorio.save(v1);
    }

    @Override
    public Visitas modificar(Visitas v1) {
        return repositorio.save(v1);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }

    @Override
    public Visitas obtenerUno(int id) {
        return repositorio.findById(id).orElse(new Visitas());
    }

    @Override
    public List<Visitas> obtenerTodos() {
        return repositorio.findAll();
    }
}
