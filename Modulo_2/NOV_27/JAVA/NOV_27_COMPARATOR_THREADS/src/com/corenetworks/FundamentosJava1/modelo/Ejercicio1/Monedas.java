package com.corenetworks.FundamentosJava1.modelo.Ejercicio1;

public class Monedas {
    private double numeroMonedas;
    private double numeroBilletes;

    public double cambio(Monedas c1, double gasto){
        return (c1.numeroBilletes + c1.numeroMonedas) - Math.floor(gasto);
    }

    @Override
    public String toString() {
        return "Monedas{" +
                "numeroMonedas=" + numeroMonedas +
                ", numeroBilletes=" + numeroBilletes +
                '}';
    }

    public Monedas() {
    }

    public Monedas(double numeroMonedas, double numeroBilletes) {
        this.numeroMonedas = numeroMonedas;
        this.numeroBilletes = numeroBilletes;
    }

    public double getNumeroMonedas() {
        return numeroMonedas;
    }

    public void setNumeroMonedas(double numeroMonedas) {
        this.numeroMonedas = numeroMonedas;
    }

    public double getNumeroBilletes() {
        return numeroBilletes;
    }

    public void setNumeroBilletes(double numeroBilletes) {
        this.numeroBilletes = numeroBilletes;
    }
}
