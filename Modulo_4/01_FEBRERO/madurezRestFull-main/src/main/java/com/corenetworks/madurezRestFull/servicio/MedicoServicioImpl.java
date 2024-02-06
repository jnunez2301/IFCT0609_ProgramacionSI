package com.corenetworks.madurezRestFull.servicio;

import com.corenetworks.madurezRestFull.modelo.Medico;
import com.corenetworks.madurezRestFull.repositorio.IGenericoRepositorio;
import com.corenetworks.madurezRestFull.repositorio.IMedicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoServicioImpl extends CRUDImpl<Medico, Integer> implements IMedicoServicio{
    @Autowired
    private IMedicoRepositorio repo;
    @Override
    protected IGenericoRepositorio<Medico, Integer> getRepo() {
        return repo;
    }
}
