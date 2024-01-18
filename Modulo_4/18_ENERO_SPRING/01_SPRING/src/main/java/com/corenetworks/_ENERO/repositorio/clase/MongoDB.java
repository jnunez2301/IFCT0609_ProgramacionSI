package com.corenetworks._ENERO.repositorio.clase;

import com.corenetworks._ENERO.modelo.Cliente;
import com.corenetworks._ENERO.repositorio.interfaces.IBBDD;
import org.springframework.stereotype.Component;

@Component
public class MongoDB implements IBBDD {
    @Override
    public String baseDatos() {
        return "Conectando a MongoDB";
    }
    @Override
    public String insertar(Cliente c1){
        return String.format("%-20s %-20s %-20s","Insertando en MongoDB",c1.getDni(), c1.getNombre());
    }
    @Override
    public String eliminar(Cliente c1){
        return "Eliminando en MongoDB" + c1.getDni() + "-".repeat(10) + c1.getNombre();
    }
    @Override
    public String modificar(Cliente c1){
        return "Modificando en MongoDB" + c1.getDni() + "-".repeat(10) + c1.getNombre();
    }
    @Override
    public String consultar(Cliente c1){
        return "Consultando en MongoDB" + c1.getDni() + "-".repeat(10) + c1.getNombre();
    }
}
