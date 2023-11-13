package com.corenetworks.ejercicios.modelo;

public class AccesoDesarollo implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return "Cliente insertado en **Desarollo** "  + c1.getNombre();
    }
}
