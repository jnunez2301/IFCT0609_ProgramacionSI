package com.corenetworks.modelo;

public enum EstadoCivilAvanzado {
    CASADO("Casado"),
    DIVORCIADO("Divorciado"),
    SOLTERO("Soltero"),
    VIUDO("Viudo"),
    OTRO("Otro");

    private final String descripcion;

    EstadoCivilAvanzado(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
