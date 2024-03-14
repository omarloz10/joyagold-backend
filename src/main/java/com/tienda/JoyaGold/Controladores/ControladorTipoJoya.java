package com.tienda.JoyaGold.Controladores;

import com.tienda.JoyaGold.Entidades.TipoJoya;
import com.tienda.JoyaGold.Servicios.implementacion.ServicioTipoJoyaImpl;
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
@RequestMapping("/api/v1/tipojoya")
@CrossOrigin(origins = "*")
public class ControladorTipoJoya {

    @Autowired
    private ServicioTipoJoyaImpl servicio;

    @GetMapping("/")
    public ResponseEntity<?> traerTodo() {

        List<TipoJoya> tipoJoyas = servicio.traerTodo();

        return tipoJoyas
                .isEmpty()
                        ? ResponseEntity
                                .noContent()
                                .build()
                        : ResponseEntity
                                .ok()
                                .body(tipoJoyas);
    }
}
