package com.corenetworks.modelo;

import java.lang.reflect.Constructor;

public class Producto {
    private int id;

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                '}';
    }
    public Producto() {}

    public Producto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

