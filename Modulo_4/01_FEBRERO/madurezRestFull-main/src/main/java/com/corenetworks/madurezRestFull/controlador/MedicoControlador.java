package com.corenetworks.madurezRestFull.controlador;

import com.corenetworks.madurezRestFull.excepciones.ExcepcionNoEncontrado;
import com.corenetworks.madurezRestFull.modelo.Medico;
import com.corenetworks.madurezRestFull.servicio.IMedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {
    @Autowired
    private IMedicoServicio servicio;
    @GetMapping
    public ResponseEntity<List<Medico>> consultarTodos(){
        return new ResponseEntity<>(servicio.consultaTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> consultarUno(@PathVariable("id") int id){
        Medico m = servicio.consultaUno(id);
        if(m == null){
            throw new ExcepcionNoEncontrado("recurso no encontrado" + id);
        }
        return new ResponseEntity<>(m, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Medico> crear(@RequestBody Medico medico){
        Medico mMBBDD = servicio.crear(medico);

        return new ResponseEntity<>(mMBBDD, HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Medico> modificar(@RequestBody Medico m1){
        Medico mBBDD = servicio.consultaUno(m1.getIdMedico());

        if(mBBDD==null){
            throw new ExcepcionNoEncontrado("Recurso no encontrado" + m1.getIdMedico());
        }

        return new ResponseEntity<>(servicio.modificar(mBBDD), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Medico> eliminar(@PathVariable("id") int id){
        Medico mDB = servicio.consultaUno(id);

        if(mDB == null){
            throw new ExcepcionNoEncontrado("recurso no encontrado" + id);
        }

        servicio.eliminar(id);
        
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
