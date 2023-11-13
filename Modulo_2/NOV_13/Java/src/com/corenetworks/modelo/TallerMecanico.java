package com.corenetworks.modelo;

public class TallerMecanico implements ITaller{

    @Override
    public String reparar(Coche c) {
        return "El coche esta en el Taller Mecánico " + c.getMatricula() + " modelo " + c.getModelo();
    }
}
