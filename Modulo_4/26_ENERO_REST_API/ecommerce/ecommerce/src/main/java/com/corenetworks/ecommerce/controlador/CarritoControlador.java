package com.corenetworks.ecommerce.controlador;


import com.corenetworks.ecommerce.modelo.Carrito;
import com.corenetworks.ecommerce.servicio.ICarritoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class CarritoControlador {

    @Autowired
    private ICarritoServicio carritoServicio;

    @PostMapping
    public Carrito crearCarrito(@RequestBody Carrito c1) {
        return carritoServicio.insertar(c1);
    }
    @GetMapping
    public List<Carrito> obtenerTodos(){
        return carritoServicio.obtenerTodos();
    }
    @GetMapping("/{id}")
    public Carrito obtenerCarrito(@PathVariable("id")int id){
        return carritoServicio.obtenerUno(id);
    }
    @PutMapping
    public Carrito modificarCarrito(@RequestBody Carrito c1){
        return carritoServicio.modificar(c1);
    }
    @DeleteMapping("/{id}")
    public void eliminarUno(@PathVariable("id") int id){
        carritoServicio.eliminar(id);
    }
}
