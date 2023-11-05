package com.corenetowrks.Paciente.Modelo;

public class Medico {
    private int idMedico;
    private String nombre;
    private String apellido;
    private String cmp;

    public Medico() {
    }

    @Override
    public String toString(){
        return "Paciente: \n"
                + idMedico + " id medico\n"
                + nombre + " nombre medico\n"
                + apellido + " apellido medico\n"
                + cmp + " cmp \n";
    }
    public Medico(int idMedico, String nombre, String apellido, String cmp) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cmp = cmp;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
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

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }


}
