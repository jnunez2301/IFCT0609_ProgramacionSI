package com.demoCapas.demo.servicio;

import com.demoCapas.demo.modelo.Inmueble;
import com.demoCapas.demo.repositorio.IRepoInmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioInmueble implements IServicioInmueble{
    @Autowired
    private IRepoInmueble capaRepo;
    @Override
    public String infoInmueble(Inmueble imb) {
        return capaRepo.infoInmueble(imb);
    }
}
