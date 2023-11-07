package com.corenetworks.modelo;

public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(int x, int y){
        super(x, y);
    }
    public Rectangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    //Firma para rellenarla
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
