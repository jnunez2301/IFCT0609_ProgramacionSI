package com.corenetworks.modelo;

public class Circulo extends Figura{

    private int radio;

    public Circulo(){}
    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
