package com.tienda.JoyaGold.Servicios;

import com.tienda.JoyaGold.Entidades.Producto;
import java.util.List;

/**
 *
 * @author Omar Lozano
 */
public interface ServicioProducto {

    public List<Producto> traerTodo();

    public Producto traerPorId(Integer id);

    public Producto crearProducto(Producto producto);

    public void borrarProducto(Integer id);
}
