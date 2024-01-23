package com.corenetworks.hibernacion.repositorio;

import com.corenetworks.hibernacion.modelo.Socios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISocioRepo extends JpaRepository<Socios, String> {
}
