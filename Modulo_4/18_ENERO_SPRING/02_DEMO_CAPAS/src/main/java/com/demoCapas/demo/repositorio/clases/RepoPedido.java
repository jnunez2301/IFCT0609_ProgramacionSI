package com.demoCapas.demo.repositorio.clases;

import com.demoCapas.demo.modelo.Pedido;
import com.demoCapas.demo.repositorio.interfaces.IRepo;
import org.springframework.stereotype.Repository;


@Repository
public class RepoPedido implements IRepo {
    @Override
    public String insertar(Pedido p) {
        return String.format("Capa repo %-5s", p.toString());
    }
}
