package com.crud.demo.repositorio;

import com.crud.demo.modelo.Visitas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVisitasRepo extends JpaRepository<Visitas, Integer> {
}
