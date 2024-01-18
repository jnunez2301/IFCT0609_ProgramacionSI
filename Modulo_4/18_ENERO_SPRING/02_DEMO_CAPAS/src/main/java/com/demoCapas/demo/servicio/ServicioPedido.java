package com.demoCapas.demo.servicio;

import com.demoCapas.demo.modelo.Pedido;
import com.demoCapas.demo.repositorio.IRepoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPedido implements IServicioPedido {
    @Autowired
    private IRepoPedido capaRepo;
    @Override
    public String insertar(Pedido p1) {
        return capaRepo.insertar(p1);
    }
}
