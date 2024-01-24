package com.crud.demo.repositorio;

import com.crud.demo.modelo.Lugares;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugaresRepo extends JpaRepository<Lugares, Integer> {
}
