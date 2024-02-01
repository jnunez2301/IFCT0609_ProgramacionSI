package com.corenetworks.cardinalidades.Repaso.servicio;

import com.corenetworks.cardinalidades.Repaso.modelo.Editorial;
import com.corenetworks.cardinalidades.Repaso.modelo.Libro;
import com.corenetworks.cardinalidades.Repaso.repositorio.IEditorialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EditorialServicioImpl implements IEditorialServicio{
    @Autowired
    private IEditorialRepo editorialRepo;
    @Override
    public Editorial crear(Editorial e) {
        for (Libro elemento:
                e.getLibros()) {
            elemento.setEditorial(e);
        }
        return editorialRepo.save(e);
    }

    @Override
    public Editorial modificar(Editorial e) {
        for (Libro elemento:
                e.getLibros()) {
            elemento.setEditorial(e);
        }
        return editorialRepo.save(e);
    }

    @Override
    public void eliminar(int id) {
        editorialRepo.deleteById(id);
    }

    @Override
    public Editorial consultarUno(int id) {
        return editorialRepo.findById(id).orElse(null);
    }

    @Override
    public List<Editorial> consultarTodos() {
        return editorialRepo.findAll();
    }

    @Override
    public List<Editorial> filtroPorDireccion(String direccion) {
        return  editorialRepo.filtroPorDireccion(direccion);
    }

    @Override
    public List<Editorial> filtroPorNombre(String nombre) {
        return editorialRepo.filtroPorNombre(nombre);
    }
}
