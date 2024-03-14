package com.tienda.JoyaGold.Controladores;

import com.tienda.JoyaGold.Entidades.Talla;
import com.tienda.JoyaGold.Servicios.implementacion.ServicioTallaImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Omar Lozano
 */
@RestController
@RequestMapping("/api/v1/talla")
@CrossOrigin(origins = "*")
public class ControladorTalla {

    @Autowired
    private ServicioTallaImpl servicio;

    @GetMapping("/")
    public ResponseEntity<?> traerTodo() {
        List<Talla> tallas = servicio.traerTodo();

        if (!tallas.isEmpty()) {
            return ResponseEntity
                    .ok()
                    .body(tallas);
        }

        return ResponseEntity
                .noContent()
                .build();
    }

}
