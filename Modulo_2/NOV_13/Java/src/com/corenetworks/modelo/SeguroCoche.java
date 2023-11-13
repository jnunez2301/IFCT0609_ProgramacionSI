package com.corenetworks.modelo;

public class SeguroCoche {
    private ITaller taller; // Acoplamiento
    private String aseguradora;

    public String repararCoche(Coche c){
        return taller.reparar(c);
    };

    public SeguroCoche() {
    }

    public SeguroCoche(ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    @Override
    public String toString() {
        return "SeguroCoche{" +
                "taller=" + taller +
                ", aseguradora='" + aseguradora + '\'' +
                '}';
    }

    public ITaller getTaller() {
        return taller;
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}
