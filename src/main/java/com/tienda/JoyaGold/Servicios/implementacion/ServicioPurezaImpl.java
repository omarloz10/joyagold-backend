package com.tienda.JoyaGold.Servicios.implementacion;

import com.tienda.JoyaGold.Entidades.Pureza;
import com.tienda.JoyaGold.Repositorios.RepositorioPureza;
import com.tienda.JoyaGold.Servicios.ServicioPureza;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omar Lozano
 */
@Service
public class ServicioPurezaImpl implements ServicioPureza {

    @Autowired
    private RepositorioPureza repositorio;

    @Override
    public List<Pureza> traerTodo() {
        return repositorio.findAll();
    }

}
