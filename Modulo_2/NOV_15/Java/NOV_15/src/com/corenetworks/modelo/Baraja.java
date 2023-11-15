package com.corenetworks.modelo;

import java.util.Arrays;

public class Baraja {
    Carta[] baraja;

    @Override
    public String toString() {
        return "Baraja{\n" +
                "length=" + baraja.length +
                "\nbaraja=" + Arrays.toString(baraja) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baraja baraja1 = (Baraja) o;
        return Arrays.equals(baraja, baraja1.baraja);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(baraja);
    }

    public Baraja() {
        this.baraja = new Carta[52];
        int index = 0;

        for(Palo palo: Palo.values()){
             for(Numeros numero: Numeros.values()){
                    baraja[index] = new Carta(palo, numero);
                    index++;
            }
        }
    }

    public Carta[] getBaraja() {
        return baraja;
    }

    public void setBaraja(Carta[] baraja) {
        this.baraja = baraja;
    }
}
