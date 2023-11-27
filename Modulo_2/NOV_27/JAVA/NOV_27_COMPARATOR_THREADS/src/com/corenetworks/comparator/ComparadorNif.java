package com.corenetworks.comparator;

import java.util.Comparator;

public class ComparadorNif implements Comparator {
    public int compare(Object o1, Object o2){
        return ((ClienteSimple) o1).nif.compareTo(((ClienteSimple) o2).nif);
    }
}
