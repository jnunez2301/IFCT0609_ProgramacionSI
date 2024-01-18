package com.demoCapas.demo.repositorio;

import com.demoCapas.demo.modelo.Pedido;
import org.springframework.stereotype.Repository;


@Repository
public class RepoPedido implements IRepoPedido {
    @Override
    public String insertar(Pedido p) {
        return String.format("Capa repo %-5s", p.toString());
    }
}
