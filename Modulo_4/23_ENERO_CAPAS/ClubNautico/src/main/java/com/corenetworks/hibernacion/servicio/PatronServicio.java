package com.corenetworks.hibernacion.servicio;

import com.corenetworks.hibernacion.modelo.Patron;
import com.corenetworks.hibernacion.repositorio.IPatronRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatronServicio implements IPatronServicio{
    @Autowired
    private IPatronRepo patronRepo;
    @Override
    public Patron insertar(Patron p1) {
        return patronRepo.save(p1);
    }

    @Override
    public Patron modificar(Patron p1) {
        return patronRepo.save(p1);
    }

    @Override
    public void eliminar(String dniPatron) {
        patronRepo.deleteById(dniPatron);
    }

    @Override
    public Patron obtenerUno(String dniPatron) {
        return patronRepo.findById(dniPatron).orElse(new Patron());
    }

    @Override
    public List<Patron> obtenerTodos() {
        return patronRepo.findAll();
    }
}
