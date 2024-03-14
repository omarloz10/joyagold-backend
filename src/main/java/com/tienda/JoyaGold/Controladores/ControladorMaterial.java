package com.tienda.JoyaGold.Controladores;

import com.tienda.JoyaGold.Entidades.Material;
import com.tienda.JoyaGold.Servicios.implementacion.ServicioMaterialImpl;
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
@RequestMapping("/api/v1/materiales")
@CrossOrigin(origins = "*")
public class ControladorMaterial {

    @Autowired
    private ServicioMaterialImpl servicio;

    @GetMapping("/")
    public ResponseEntity<?> traerTodo() {
        List<Material> materiales = servicio.traerTodo();

        if (!materiales.isEmpty()) {
            return ResponseEntity
                    .ok()
                    .body(materiales);
        }
        return ResponseEntity
                .noContent()
                .build();
    }

}
