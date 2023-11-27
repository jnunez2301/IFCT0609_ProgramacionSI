package com.corenetworks.comparator;

import java.util.Comparator;

public class ComparadorNombre implements Comparator {
    public int compare(Object o1, Object o2){
        return ((ClienteSimple) o1).nombre.compareTo(((ClienteSimple) o2).nombre);
    }
}
