package com.ejercicios.modelo;

public class Operador extends Empleado{
    private int piezas;
    private double incentivo;
    public Operador(){}

    public Operador(String nombre, double sueldo, int piezas, double incentivo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public double calcularNomina() {
        return sueldo + piezas * incentivo;
    }

    @Override
    public String toString() {
        return "Operador{" +
                "piezas=" + piezas +
                ", incentivo=" + incentivo +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}

