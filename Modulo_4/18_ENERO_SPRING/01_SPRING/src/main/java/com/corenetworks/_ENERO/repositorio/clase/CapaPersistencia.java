package com.corenetworks._ENERO.repositorio.clase;

import com.corenetworks._ENERO.modelo.Cliente;
import com.corenetworks._ENERO.repositorio.interfaces.IBBDD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CapaPersistencia {
    @Autowired
    private IBBDD baseDatos;
    public String insertar(Cliente c1){
        return baseDatos.insertar(c1);
    }
    public String eliminar(Cliente c1){
        return baseDatos.eliminar(c1);
    }
    public String modificar(Cliente c1){
        return baseDatos.modificar(c1);
    }
    public String consultar(Cliente c1){
        return baseDatos.consultar(c1);
    }
}
