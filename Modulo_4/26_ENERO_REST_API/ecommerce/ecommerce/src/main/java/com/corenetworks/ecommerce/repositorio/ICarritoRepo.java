package com.corenetworks.ecommerce.repositorio;

import com.corenetworks.ecommerce.modelo.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarritoRepo extends JpaRepository<Carrito, Integer> {
}
