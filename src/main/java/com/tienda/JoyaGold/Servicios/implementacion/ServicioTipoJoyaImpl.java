package com.tienda.JoyaGold.Servicios.implementacion;

import com.tienda.JoyaGold.Entidades.TipoJoya;
import com.tienda.JoyaGold.Repositorios.RepositorioTipoJoya;
import com.tienda.JoyaGold.Servicios.ServicioTipoJoya;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omar Lozano
 */
@Service
public class ServicioTipoJoyaImpl implements ServicioTipoJoya {

    @Autowired
    private RepositorioTipoJoya repositorio;

    @Override
    public List<TipoJoya> traerTodo() {
        return repositorio.findAll();
    }

}
