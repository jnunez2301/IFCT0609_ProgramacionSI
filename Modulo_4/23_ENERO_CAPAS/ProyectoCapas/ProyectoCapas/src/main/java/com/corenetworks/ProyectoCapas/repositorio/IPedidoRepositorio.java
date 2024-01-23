package com.corenetworks.ProyectoCapas.repositorio;

import com.corenetworks.ProyectoCapas.modelo.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepositorio extends JpaRepository<Pedidos, Integer> {
}
