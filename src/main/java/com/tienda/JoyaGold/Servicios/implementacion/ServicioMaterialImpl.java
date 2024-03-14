package com.tienda.JoyaGold.Servicios.implementacion;

import com.tienda.JoyaGold.Entidades.Material;
import com.tienda.JoyaGold.Repositorios.RepositorioMaterial;
import com.tienda.JoyaGold.Servicios.ServicioMaterial;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omar Lozano
 */
@Service
public class ServicioMaterialImpl implements ServicioMaterial {

    @Autowired
    private RepositorioMaterial repositorio;

    @Override
    public List<Material> traerTodo() {
        return repositorio.findAll();
    }
}
