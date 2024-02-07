package com.corenetworks.validcaciones.servicio.impl;

import com.corenetworks.validcaciones.repositorio.IGenericoRepo;
import com.corenetworks.validcaciones.servicio.ICRUD;

import java.util.List;

public abstract class CRUDimpl<T, ID> implements ICRUD<T, ID> {

    protected abstract IGenericoRepo<T, ID> getRepo();
    @Override
    public T crear(T t) {
        return getRepo().save(t);
    }

    @Override
    public T modificar(T t) {
        return getRepo().save(t);
    }

    @Override
    public void eliminar(ID id) {
        getRepo().deleteById(id);
    }

    @Override
    public T consultarUno(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public List<T> cosnultarTodos(T t) {
        return getRepo().findAll();
    }
}
