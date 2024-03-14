package com.tienda.JoyaGold.Servicios.implementacion;

import com.tienda.JoyaGold.Entidades.Talla;
import com.tienda.JoyaGold.Repositorios.RepositorioTalla;
import com.tienda.JoyaGold.Servicios.ServicioTalla;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omar Lozano
 */
@Service
public class ServicioTallaImpl implements ServicioTalla {

    @Autowired
    private RepositorioTalla repositorio;

    @Override
    public List<Talla> traerTodo() {
        return repositorio.findAll();
    }

}
