package com.corenetworks.cardinalidades.Repaso.controldor;

import com.corenetworks.cardinalidades.Repaso.excepciones.ExcepcionNoEncontradoModelo;
import com.corenetworks.cardinalidades.Repaso.modelo.Editorial;
import com.corenetworks.cardinalidades.Repaso.modelo.Libro;
import com.corenetworks.cardinalidades.Repaso.servicio.IEditorialServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoriales")
public class EditorialControlador {
    @Autowired
    private IEditorialServicio servicio;

    @PostMapping
    public ResponseEntity<Editorial> crear(@RequestBody Editorial e){
        Editorial entrada = servicio.crear(e);
        return new ResponseEntity<Editorial>(entrada, HttpStatus.CREATED);
    }

    @PutMapping
    public Editorial modificar(@RequestBody Editorial e){
        return servicio.modificar(e);
    }

    @DeleteMapping("/{id}")
    void eliminar(@PathVariable(name="id") int id){
         servicio.eliminar(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Editorial> consultarUno(@PathVariable(name="id") int id){
        Editorial eBBDD = servicio.consultarUno(id);
        if(eBBDD==null){
            throw new ExcepcionNoEncontradoModelo("ID NO ENCONTRADO " + id);
        }

        return  new ResponseEntity<>(eBBDD,HttpStatus.OK);
    }

    @GetMapping
    public List<Editorial> consultarTodos(){
        return servicio.consultarTodos();
    }
    @GetMapping("/filtro/{direccion}")
    public List<Editorial> filtroPorDireccion(@PathVariable(name="direccion") String direccion){
        return servicio.filtroPorDireccion(direccion);
    }

    @GetMapping("/filtro")
    public List<Editorial> filtroPorNombre(@RequestParam("nombre") String nombre){
        return servicio.filtroPorNombre(nombre);
    }


}
