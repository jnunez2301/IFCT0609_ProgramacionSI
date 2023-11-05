package com.corenetowrks.Paciente.Modelo;

public class Vendedor {
    private int idEmpleado;
    private double sueldo;
    private String dni;
    private String nombre;
    private double Ventas;
    private double porcentajeComision;

    public Vendedor () {}

    public Vendedor(int idEmpleado, double sueldo, String dni, String nombre, double ventas, double porcentajeComision) {
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
        this.dni = dni;
        this.nombre = nombre;
        Ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    public double calcularSueld(){
        double porcentajeVentasComision = (porcentajeComision + 1) * sueldo;
        return porcentajeVentasComision;
    }
    public double calcularImpuesto(){
        return sueldo * 0.3;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVentas() {
        return Ventas;
    }

    public void setVentas(double ventas) {
        Ventas = ventas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
}

