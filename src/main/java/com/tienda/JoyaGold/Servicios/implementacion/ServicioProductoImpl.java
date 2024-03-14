package com.tienda.JoyaGold.Servicios.implementacion;

import com.tienda.JoyaGold.Entidades.Producto;
import com.tienda.JoyaGold.Repositorios.RepositorioProducto;
import com.tienda.JoyaGold.Servicios.ServicioProducto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omar Lozano
 */
@Service
public class ServicioProductoImpl implements ServicioProducto {

    @Autowired
    private RepositorioProducto repositorio;

    @Override

    public List<Producto> traerTodo() {
        return repositorio.findAllByNombreASC();
    }

    @Override
    public Producto traerPorId(Integer id) {

        return repositorio.findById(id).get();
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return repositorio.save(producto);
    }

    @Override
    public void borrarProducto(Integer id) {
        repositorio.deleteById(id);
    }

}
