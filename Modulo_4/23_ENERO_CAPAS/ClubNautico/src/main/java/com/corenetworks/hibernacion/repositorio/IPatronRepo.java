package com.corenetworks.hibernacion.repositorio;

import com.corenetworks.hibernacion.modelo.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatronRepo extends JpaRepository<Patron, String> {
}
