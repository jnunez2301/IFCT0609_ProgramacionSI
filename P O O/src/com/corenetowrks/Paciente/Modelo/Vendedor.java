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

}

