package com.corenetworks.modelo;

public class Empleado {
    private int idEmpleado;
    private String Nombre;

    private String Apellidos;
    private int jefe;

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", jefe=" + jefe +
                '}';
    }

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, String apellidos, int jefe) {
        this.idEmpleado = idEmpleado;
        Nombre = nombre;
        Apellidos = apellidos;
        this.jefe = jefe;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getJefe() {
        return jefe;
    }

    public void setJefe(int jefe) {
        this.jefe = jefe;
    }
}
