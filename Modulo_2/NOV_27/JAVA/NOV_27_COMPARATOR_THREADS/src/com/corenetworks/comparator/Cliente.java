package com.corenetworks.comparator;

public class Cliente implements Comparable{
    String nombre;
    double cifraVentas;
    String nif;

    @Override
    public int compareTo(Object o){
        Cliente otroCliente = null;
        int resultado = 0;
        if( o instanceof  Cliente ){
            otroCliente = (Cliente) o;
        }
        // 0 - > Son iguales
        if(cifraVentas == otroCliente.cifraVentas){
            resultado = 0;
        } else if (cifraVentas > otroCliente.cifraVentas) {
            resultado = 1;
        }else if(cifraVentas < otroCliente.cifraVentas){
            resultado = -1;
        }
        return  resultado;
    }

    public Cliente(String nombre, double cifraVentas, String nif) {
        this.nombre = nombre;
        this.cifraVentas = cifraVentas;
        this.nif = nif;
    }
}
