package com.demoCapas.demo.repositorio;

import com.demoCapas.demo.modelo.Inmueble;
import org.springframework.stereotype.Repository;

@Repository
public class RepoInmueble implements IRepoInmueble{
    @Override
    public String infoInmueble(Inmueble imb) {
        return String.format("Info inmueble %s ", imb.toString());
    }
}
