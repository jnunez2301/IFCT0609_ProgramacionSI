package com.corenetworks._ENERO.persistencia;

import com.corenetworks._ENERO.modelo.Cliente;
import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
public class CapaPersistenciaPostgres implements IBBDD{
    @Override
    public String baseDatos() {
        return "Conectando a PostgreSQL";
    }
    public String insertar(Cliente c1){
        return "Insertando en PostgreSQL";
    }
    public String eliminar(Cliente c1){
        return "Eliminando en PostgreSQL";
    }
    public String modificar(Cliente c1){
        return "Modificando en PostgreSQL";
    }
    public String consultar(Cliente c1){
        return "Consultando en PostgreSQL";
    }

}
