package com.demoCapas.demo.servicio;

import com.demoCapas.demo.modelo.Factura;
import com.demoCapas.demo.repositorio.IRepoFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioFactura implements IServicioFactura{
    @Autowired
    private IRepoFactura capaRepo;

    @Override
    public String infoFactura(Factura f1) {
        return capaRepo.infoFactura(f1);
    }
}
