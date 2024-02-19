package com.corenetworks.validcaciones.servicio.impl;

import com.corenetworks.validcaciones.modelo.Empleado;
import com.corenetworks.validcaciones.repositorio.IEmpleadoRepo;
import com.corenetworks.validcaciones.repositorio.IGenericoRepo;
import com.corenetworks.validcaciones.servicio.IEmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServicio extends CRUDimpl<Empleado, Integer> implements IEmpleadoServicio {
    @Autowired
    private IEmpleadoRepo repo;

    @Override
    protected IGenericoRepo getRepo() {
        return repo;
    }
}

