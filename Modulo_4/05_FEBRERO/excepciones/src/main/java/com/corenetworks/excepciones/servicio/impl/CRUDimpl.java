package com.corenetworks.excepciones.servicio.impl;

import com.corenetworks.excepciones.modelo.Producto;
import com.corenetworks.excepciones.repositorio.IGenericRepository;
import com.corenetworks.excepciones.servicio.ICRUD;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

// abstract?
public abstract class CRUDimpl<T, ID> implements ICRUD<T, ID> {

    @Autowired
    protected abstract IGenericRepository<T, ID> getRepository();
    @Override
    public T registrar(T t) throws Exception {
        return getRepository().save(t);
    }

    @Override
    public T modificar(T t) throws Exception {
        return getRepository().save(t);
    }

    @Override
    public void eliminar(ID id) throws Exception {
        getRepository().deleteById(id);
    }

    @Override
    public T listarPorId(ID id) throws Exception {
        return getRepository().findById(id).orElse(null);
    }

    @Override
    public List<T> listar() throws Exception {
        return getRepository().findAll();
    }
}
