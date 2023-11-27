package com.corenetworks.FundamentosJava1.modelo.Ejercicio2;

import java.util.Objects;

public class TiposDato {
    private String cadena;
    private int numeroEntero;
    private boolean booleano;
    private double doble;
    private float flotante;

    public TiposDato() {
    }

    public TiposDato(String cadena, int numeroEntero, boolean booleano, double doble, float flotante) {
        this.cadena = cadena;
        this.numeroEntero = numeroEntero;
        this.booleano = booleano;
        this.doble = doble;
        this.flotante = flotante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TiposDato tiposDato = (TiposDato) o;
        return numeroEntero == tiposDato.numeroEntero && booleano == tiposDato.booleano && Double.compare(tiposDato.doble, doble) == 0 && Float.compare(tiposDato.flotante, flotante) == 0 && Objects.equals(cadena, tiposDato.cadena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadena, numeroEntero, booleano, doble, flotante);
    }

    @Override
    public String toString() {
        return "TiposDato{" +
                "cadena='" + cadena + '\'' +
                ", numeroEntero=" + numeroEntero +
                ", booleano=" + booleano +
                ", doble=" + doble +
                ", flotante=" + flotante +
                '}';
    }
}
