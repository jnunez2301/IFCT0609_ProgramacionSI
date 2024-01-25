package com.crud.demo.servicio;

import com.crud.demo.modelo.Lugares;
import com.crud.demo.repositorio.ILugaresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugaresServicio implements ILugaresServicio{
    @Autowired
    private ILugaresRepo repositorio;

    @Override
    public Lugares insertar(Lugares l1) {
        return repositorio.save(l1);
    }

    @Override
    public Lugares modificar(Lugares l1) {
        return repositorio.save(l1);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }

    @Override
    public Lugares obtenerUno(int id) {
        return repositorio.findById(id).orElse(new Lugares());
    }

    @Override
    public List<Lugares> obtenerTodos() {
        return repositorio.findAll();
    }

}
