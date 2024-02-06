package com.corenetworks.madurezRestFull.controlador;

import com.corenetworks.madurezRestFull.excepciones.ExcepcionNoEncontrado;
import com.corenetworks.madurezRestFull.modelo.Paciente;
import com.corenetworks.madurezRestFull.servicio.IConsultaServicio;
import com.corenetworks.madurezRestFull.servicio.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {
    @Autowired
    private IPacienteServicio servicio;

    @GetMapping
    public ResponseEntity<List<Paciente>>consultarTodas(){
        return new ResponseEntity<>(servicio.consultaTodos(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Paciente> crear(@RequestBody Paciente p){
        Paciente pBBDD = servicio.crear(p);
        return new ResponseEntity<>(pBBDD, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Paciente> consultarUno(@PathVariable("id") int id){
        Paciente cm = servicio.consultaUno(id);
        if(cm==null){
            throw new ExcepcionNoEncontrado("recurso no encontrado " + id);
        }
        return new ResponseEntity<>(cm, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Paciente> modificar(@RequestBody Paciente p){
        Paciente pBBDD = servicio.consultaUno(p.getIdPaciente());
        if(pBBDD==null){
            throw new ExcepcionNoEncontrado("recurso no encontrado " + p.getIdPaciente());
        }
        return new ResponseEntity<>(servicio.modificar(p),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id){
        Paciente pBBDD = servicio.consultaUno(id);
        if(pBBDD==null){
            throw new ExcepcionNoEncontrado("recurso no encontrado " + id);
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }




}
