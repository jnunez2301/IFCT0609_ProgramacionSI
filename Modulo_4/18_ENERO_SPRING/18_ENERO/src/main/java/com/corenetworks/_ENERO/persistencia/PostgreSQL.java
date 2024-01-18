package com.corenetworks._ENERO.persistencia;

import com.corenetworks._ENERO.modelo.Cliente;
import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQL implements IBBDD{
    @Override
    public String baseDatos() {
        return "Conectando a PostgreSQL";
    }
    @Override
    public String insertar(Cliente c1){
        return String.format("%-20s %-20s %-20s","Insertando en PostgreSQL",c1.getDni(), c1.getNombre());
    }
    @Override
    public String eliminar(Cliente c1){
        return "Eliminando en PostgreSQL" + c1.getDni() + "-".repeat(10) + c1.getNombre();
    }
    @Override
    public String modificar(Cliente c1){
        return "Modificando en PostgreSQL" + c1.getDni() + "-".repeat(10) + c1.getNombre();
    }
    @Override
    public String consultar(Cliente c1){
        return "Consultando en PostgreSQL" + c1.getDni() + "-".repeat(10) + c1.getNombre();
    }

}
