package com.corenetworks.modelo;

public class Empleado {
    private int id;

    Empleado (){}

    public Empleado(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                '}';
    }
}
