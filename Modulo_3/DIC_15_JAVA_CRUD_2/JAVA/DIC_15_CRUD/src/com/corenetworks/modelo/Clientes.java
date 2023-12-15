package com.corenetworks.modelo;

import java.util.Objects;

public class Clientes {
    private String idCliente;
    private String nombreCliente;
    private String contactoCliente;

    public Clientes() {
    }

    public Clientes(String idCliente, String nombreCliente, String contactoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.contactoCliente = contactoCliente;
    }

    @Override
    public String toString() {
        return "Clientes\n{" +
                "idCliente=" + idCliente +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", contactoCliente='" + contactoCliente + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clientes clientes = (Clientes) o;
        return idCliente == clientes.idCliente && Objects.equals(nombreCliente, clientes.nombreCliente) && Objects.equals(contactoCliente, clientes.contactoCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombreCliente, contactoCliente);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getContactoCliente() {
        return contactoCliente;
    }

    public void setContactoCliente(String contactoCliente) {
        this.contactoCliente = contactoCliente;
    }
}
