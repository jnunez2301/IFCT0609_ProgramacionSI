package com.corenetworks.excepciones.controlador;


import com.corenetworks.excepciones.modelo.Producto;
import com.corenetworks.excepciones.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoControlador {

        @Autowired
        private IProductoServicio servicio;
        @PostMapping
        public ResponseEntity<Producto> insertar(@RequestBody Producto p) throws Exception {
            Producto p1 = servicio.registrar(p);

            return new ResponseEntity<>(p1, HttpStatus.CREATED);
        }
        @GetMapping("/{id}")
        public ResponseEntity<Producto> buscarPorId(@PathVariable("id") Integer id) throws Exception {
            Producto p = servicio.listarPorId(id);
            return new ResponseEntity<>(p, HttpStatus.OK);
        }
        @GetMapping
        public ResponseEntity<List<Producto>> listar() throws Exception {
            List<Producto> lista = servicio.listar();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        }
        @PutMapping
        public ResponseEntity<Producto> actualizar(@RequestBody Producto p) throws Exception {
            Producto p1 = servicio.modificar(p);
            return new ResponseEntity<>(p1, HttpStatus.OK);
        }
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
            servicio.eliminar(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
}
