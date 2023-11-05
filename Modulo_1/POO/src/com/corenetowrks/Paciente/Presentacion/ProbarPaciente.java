package com.corenetowrks.Paciente.Presentacion;

import com.corenetowrks.Paciente.Modelo.Paciente;

public class ProbarPaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        p1.setNombre("Jon");
        p1.setApellido("nunez");
        p1.setDireccion("madrid");
        p1.setDni("000000D");
        p1.setEmail("mail@mail.com");
        p1.setIdPaciente(1);
        p1.setTelefono("689689689");
        System.out.println(p1.toString());

        Paciente p2 = new Paciente(
                2,
                "manolo",
                "gonzalez",
                "00001A",
                "CASTILLA",
                "923923923",
                "MAIL2@MAIL.COM"
        );
        System.out.println(p2.toString());
    }
}
