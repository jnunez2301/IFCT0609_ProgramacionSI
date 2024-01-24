package com.crud.demo.repositorio;

import com.crud.demo.modelo.Conductores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConductoresRepo extends JpaRepository<Conductores, String> {
}
