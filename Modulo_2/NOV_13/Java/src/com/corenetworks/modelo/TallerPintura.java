package com.corenetworks.modelo;
public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "El coche esta en el Taller Pintura " + c.getMatricula() + " modelo " + c.getModelo();
    }
}
