package com.tienda.JoyaGold.Controladores;

import com.tienda.JoyaGold.Entidades.Pureza;
import com.tienda.JoyaGold.Servicios.implementacion.ServicioPurezaImpl;
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
@RequestMapping("/api/v1/pureza")
@CrossOrigin(origins = "*")
public class ControladorPureza {

    @Autowired
    private ServicioPurezaImpl servicio;

    @GetMapping("/")
    public ResponseEntity<?> traerTodo() {
        List<Pureza> purezas = servicio.traerTodo();
        if (!purezas.isEmpty()) {
            return ResponseEntity
                    .ok()
                    .body(purezas);
        }
        return ResponseEntity
                .noContent()
                .build();
    }

}
