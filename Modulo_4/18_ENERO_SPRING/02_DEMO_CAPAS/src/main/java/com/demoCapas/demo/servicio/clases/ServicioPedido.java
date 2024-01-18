package com.demoCapas.demo.servicio.clases;

import com.demoCapas.demo.modelo.Pedido;
import com.demoCapas.demo.repositorio.interfaces.IRepo;
import com.demoCapas.demo.servicio.interfaces.IServicioPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPedido implements IServicioPedido {
    @Autowired
    private IRepo capaRepo;
    @Override
    public String insertar(Pedido p1) {
        return capaRepo.insertar(p1);
    }
}
