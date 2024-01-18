package com.corenetworks._ENERO.repositorio.interfaces;

import com.corenetworks._ENERO.modelo.Cliente;

public interface IBBDD {
    String baseDatos();
    String insertar(Cliente c1);
    String eliminar(Cliente c1);
    String modificar(Cliente c1);
    String consultar(Cliente c1);
}
