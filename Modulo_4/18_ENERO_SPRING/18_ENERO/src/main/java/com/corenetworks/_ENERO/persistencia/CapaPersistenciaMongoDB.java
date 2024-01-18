package com.corenetworks._ENERO.persistencia;

import com.corenetworks._ENERO.modelo.Cliente;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CapaPersistenciaMongoDB implements IBBDD{
    @Override
    public String baseDatos() {
        return "Conectando a MongoDB";
    }
    public String insertar(Cliente c1){
        return "Insertando en MongoDB";
    }
    public String eliminar(Cliente c1){
        return "Eliminando en MongoDB";
    }
    public String modificar(Cliente c1){
        return "Modificando en MongoDB";
    }
    public String consultar(Cliente c1){
        return "Consultando en MongoDB";
    }
}
