package com.corenetworks.modelo;

import java.util.Objects;

public class Socio {
    private int socio_id;
    private String matricula;
    private String nombre;
    private int numero_amarre;
    private double cuota;

    public Socio() {}

    public Socio(int socio_id, String matricula, String nombre, int numero_amarre, double cuota) {
        this.socio_id = socio_id;
        this.matricula = matricula;
        this.nombre = nombre;
        this.numero_amarre = numero_amarre;
        this.cuota = cuota;
    }

    public int getSocio_id() {
        return socio_id;
    }

    public void setSocio_id(int socio_id) {
        this.socio_id = socio_id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_amarre() {
        return numero_amarre;
    }

    public void setNumero_amarre(int numero_amarre) {
        this.numero_amarre = numero_amarre;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Socio\n{" +
                "socio_id=" + socio_id +
                ", matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numero_amarre=" + numero_amarre +
                ", cuota=" + cuota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return socio_id == socio.socio_id && numero_amarre == socio.numero_amarre && Double.compare(socio.cuota, cuota) == 0 && Objects.equals(matricula, socio.matricula) && Objects.equals(nombre, socio.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socio_id, matricula, nombre, numero_amarre, cuota);
    }
}
