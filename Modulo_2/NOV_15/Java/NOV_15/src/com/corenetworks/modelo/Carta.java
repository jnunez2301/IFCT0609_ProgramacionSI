package com.corenetworks.modelo;

import java.util.Objects;

public class Carta {
    Palo palo;
    Numeros numero;

    public Carta() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return palo == carta.palo && numero == carta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(palo, numero);
    }

    @Override
    public String toString() {
        return "Carta{" +
                "palo=" + palo +
                ", numero=" + numero +
                '}';
    }

    public Carta(Palo palo, Numeros numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Numeros getNumero() {
        return numero;
    }

    public void setNumero(Numeros numero) {
        this.numero = numero;
    }
}
