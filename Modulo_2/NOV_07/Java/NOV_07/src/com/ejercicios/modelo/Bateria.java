package com.ejercicios.modelo;

public class Bateria extends InstrumentoMusical{
    private int numeroPalillos;
    public Bateria(){}
    @Override
    public String emitirSonido() {
        return "pam pam";
    }

    public Bateria(String marca, int numeroPalillos) {
        super(marca);
        this.numeroPalillos = numeroPalillos;
    }

    public int getNumeroPalillos() {
        return numeroPalillos;
    }

    public void setNumeroPalillos(int numeroPalillos) {
        this.numeroPalillos = numeroPalillos;
    }



    @Override
    public String toString() {
        return "Bateria{" +
                "numeroPalillos=" + numeroPalillos +
                ", marca='" + marca + '\'' +
                '}';
    }
}
