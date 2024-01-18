package com.demoCapas.demo.repositorio;

import com.demoCapas.demo.modelo.Factura;
import org.springframework.stereotype.Repository;

@Repository
public class RepoFactura implements IRepoFactura{
    @Override
    public String infoFactura(Factura f1) {
        return String.format("Factura %s", f1.toString());
    }
}
