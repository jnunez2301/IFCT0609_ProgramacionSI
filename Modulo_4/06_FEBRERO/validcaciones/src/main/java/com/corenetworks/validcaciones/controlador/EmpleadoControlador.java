package com.corenetworks.validcaciones.controlador;

import com.corenetworks.validcaciones.dto.EmpleadoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleados")
public class EmpleadoControlador {

    @PostMapping
    public ResponseEntity<EmpleadoDto> crearEmpleado(@RequestBody EmpleadoDto e1){
        System.out.println(e1.toString());
        return new ResponseEntity<>(e1, HttpStatus.OK);
    }

}
