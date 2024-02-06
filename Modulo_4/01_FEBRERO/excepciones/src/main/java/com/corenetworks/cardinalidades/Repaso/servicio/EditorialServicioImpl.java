package com.corenetworks.cardinalidades.Repaso.servicio;

import com.corenetworks.cardinalidades.Repaso.modelo.Editorial;
import com.corenetworks.cardinalidades.Repaso.modelo.Libro;
import com.corenetworks.cardinalidades.Repaso.repositorio.IEditorialRepo;
import com.corenetworks.cardinalidades.Repaso.repositorio.IGenericoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialServicioImpl implements IEditorialServicio{


    @Autowired
    IEditorialRepo editorialRepo;
    @Override
    public Editorial crear(Editorial e) {
        return null;
    }

    @Override
    public Editorial modificar(Editorial e) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public Editorial consultarUno(int id) {
        return null;
    }

    @Override
    public List<Editorial> consultarTodos() {
        return null;
    }

    @Override
    public List<Editorial> filtroPorDireccion(String direccion) {
        return null;
    }

    @Override
    public List<Editorial> filtroPorNombre(String nombre) {
        return null;
    }
}
