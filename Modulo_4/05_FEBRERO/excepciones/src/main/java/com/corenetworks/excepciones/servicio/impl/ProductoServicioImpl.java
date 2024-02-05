package com.corenetworks.excepciones.servicio.impl;

import com.corenetworks.excepciones.modelo.Producto;
import com.corenetworks.excepciones.repositorio.IGenericRepository;
import com.corenetworks.excepciones.repositorio.IProductoRepo;
import com.corenetworks.excepciones.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public  class ProductoServicioImpl extends CRUDimpl<Producto, Integer> implements IProductoServicio{

    @Autowired
    private IProductoRepo repo;


    @Override
    protected IGenericRepository<Producto, Integer> getRepository() {
        return repo;
    }

}
