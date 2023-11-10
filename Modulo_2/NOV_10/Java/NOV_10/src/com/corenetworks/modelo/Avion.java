package com.corenetworks.modelo;

public class Avion implements IObjetoVolador{
    private String color;

    public Avion() {
    }

    public Avion(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public String despegar() {
        return "El avión esta despegando";
    }
    @Override
    public String volar() {
        return "El avión esta volando";
    }

    @Override
    public String aterrizar() {
        return "El avión esta aterrizando";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
