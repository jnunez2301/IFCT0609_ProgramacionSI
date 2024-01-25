package com.crud.demo.repositorio;

import com.crud.demo.modelo.Autobuses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutobusesRepo extends JpaRepository<Autobuses, String> {
}
