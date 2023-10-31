package com.corenetowrks.Paciente.Presentacion;

import com.corenetowrks.Paciente.Modelo.Medico;

public class ProbarMedico {
    public static void main(String[] args) {
        Medico m1 = new Medico(
                1,
                "Isidoro",
                "Tejero",
                "123123D3"
        );
        System.out.println(m1.toString());
    }
}
