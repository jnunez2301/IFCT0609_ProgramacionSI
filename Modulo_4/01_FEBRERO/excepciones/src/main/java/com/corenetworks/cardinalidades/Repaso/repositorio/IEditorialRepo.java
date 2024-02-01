package com.corenetworks.cardinalidades.Repaso.repositorio;

import com.corenetworks.cardinalidades.Repaso.modelo.Editorial;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEditorialRepo extends JpaRepository<Editorial, Integer > {
    @Query("from Editorial e where e.direccion = :direccion")
    List<Editorial> filtroPorDireccion(@Value("direccion") String direccion);
    @Query(value = "Select e.id_editorial, direccion, nombre from editoriales e where e.nombre like :nombre%",
            nativeQuery = true)
    List<Editorial> filtroPorNombre(@Value("nombre") String nombre);

}
