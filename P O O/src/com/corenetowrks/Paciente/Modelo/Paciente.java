package com.corenetowrks.Paciente.Modelo;

public class Paciente {
    // 1. Atributos
    private int idPaciente;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private String email;

    public Paciente() {}

    // 2. Metodos
    @Override
    public String toString(){
        return "Paciente: \n"
                + idPaciente + " id paciente\n"
                + nombre + " nombre paciente\n"
                + apellido + " apellido paciente\n"
                + dni + " DNI \n"
                + email + " email\n"
                + telefono + " telefono\n";
    }


    // 3. Constructores
    public Paciente(int idPaciente, String nombre, String apellido, String dni, String direccion, String telefono, String email) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
