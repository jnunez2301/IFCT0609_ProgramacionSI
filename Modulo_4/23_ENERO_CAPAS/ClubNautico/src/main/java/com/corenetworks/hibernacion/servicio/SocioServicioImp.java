package com.corenetworks.hibernacion.servicio;

import com.corenetworks.hibernacion.modelo.Socios;
import com.corenetworks.hibernacion.repositorio.ISocioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class SocioServicioImp implements ISocioServicio{

    @Autowired
    private ISocioRepo repositorio;
    @Override
    public Socios insertar(Socios s1) {
        return repositorio.save(s1);
    }

    @Override
    public Socios modificar(Socios s2) {
        return repositorio.save(s2);
    }

    @Override
    public void eliminar(String id) {
        repositorio.deleteById(id);
    }

    @Override
    public Socios obtenerUno(String id) {

        return repositorio.findById(id).orElse(new Socios());
    }

    @Override
    public List<Socios> obtenerTodos() {
        return repositorio.findAll();
    }
}
