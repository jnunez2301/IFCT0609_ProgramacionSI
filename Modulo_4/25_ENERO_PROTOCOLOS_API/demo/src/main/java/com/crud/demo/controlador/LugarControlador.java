package com.crud.demo.controlador;

import com.crud.demo.modelo.Lugares;
import com.crud.demo.servicio.ILugaresServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@RestController
@RequestMapping("/lugares")
public class LugarControlador {
    @Autowired
    ILugaresServicio lugaresServicio;

    @GetMapping
    public List<Lugares> obtenerTodos(){
        return lugaresServicio.obtenerTodos();
    }
    @GetMapping("/{id}")
    public Lugares obtenerUnLugar(@PathVariable("id") int id){
        return lugaresServicio.obtenerUno(id);
    }

    @PostMapping
    public Lugares insertarLugar(@RequestBody Lugares l1){
        return lugaresServicio.insertar(l1);
    }
}
