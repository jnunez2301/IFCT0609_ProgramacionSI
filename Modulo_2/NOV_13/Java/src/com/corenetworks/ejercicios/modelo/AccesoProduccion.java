package com.corenetworks.ejercicios.modelo;

public class AccesoProduccion implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return "Cliente insertado en --Producción-- " + c1.getNombre();
    }
}
