package com.corenetworks.validcaciones.dto;

import com.corenetworks.validcaciones.modelo.Empleado;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpleadoDto {

    private int idEmpleado;

    @NotEmpty
    @Size(min = 3, max = 60)
    private String nombreEmpleado;

    @NotNull
    @Size(min = 9, max = 9)
    private String DNI;

    @Min(400)
    @Max(3200)
    private double sueldo;

    public Empleado castEmpleado(){
        Empleado e1 = new Empleado();
        e1.setIdEmpleado(this.getIdEmpleado());
        e1.setDni(this.getDNI());
        e1.setNombreEmpleado(this.getNombreEmpleado());
        e1.setSueldo(this.getSueldo());

        return e1;
    }
    public EmpleadoDto castEmpleadoADto(Empleado e){
        idEmpleado = e.getIdEmpleado();
        DNI = e.getDni();
        nombreEmpleado = e.getNombreEmpleado();
        sueldo = e.getSueldo();
        return this;
    }
}
