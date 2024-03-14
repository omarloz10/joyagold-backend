package com.tienda.JoyaGold.Controladores;

import com.tienda.JoyaGold.Entidades.Producto;
import com.tienda.JoyaGold.Servicios.implementacion.ServicioProductoImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Omar Lozano
 */
@RestController
@RequestMapping("/api/v1/productos")
@CrossOrigin(origins = "*")
public class ControladorProducto {

    @Autowired
    private ServicioProductoImpl servicio;

    @GetMapping("/")
    public ResponseEntity<?> traerTodo() {

        List<Producto> productos = servicio.traerTodo();

        if (!productos.isEmpty()) {
            return ResponseEntity
                    .status(200)
                    .body(productos);
        }

        return ResponseEntity
                .noContent()
                .build();
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crearProducto(@RequestBody Producto producto) {

        try {
            return ResponseEntity.status(201)
                    .body(servicio
                            .crearProducto(producto));

        } catch (Exception e) {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"tipo\": \"error\", \"mensaje\": \"Error del servidor\" }");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> traerProductoPorId(@PathVariable int id) {

        try {

            return ResponseEntity
                    .ok()
                    .body(servicio.traerPorId(id));

        } catch (Exception e) {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"tipo\": \"error\", \"mensaje\": \"Error del servidor\" }");
        }
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> actualizarProducto(@PathVariable int id, @RequestBody Producto producto) {

        try {
            Producto modProducto = servicio.traerPorId(id);
            modProducto.setPrecio(producto.getPrecio());
            modProducto.setTipo(producto.getTipo());

            servicio.crearProducto(modProducto);
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"tipo\": \"exito\", \"mensaje\": \"El producto se ha modificado exitosamente\" }");
        } catch (Exception e) {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"tipo\": \"error\", \"mensaje\": \"Error del servidor\" }");
        }
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable int id) {

        try {
            servicio.borrarProducto(id);
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"tipo\": \"exito\", \"mensaje\": \"El producto se ha eliminado exitosamente\" }");
        } catch (Exception e) {

            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"tipo\": \"error\", \"mensaje\": \"Error del servidor\" }");
        }
    }

}
