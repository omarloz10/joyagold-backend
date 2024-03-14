package com.tienda.JoyaGold.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.JoyaGold.Entidades.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Omar Lozano
 */
@Repository
public interface RepositorioProducto extends JpaRepository<Producto, Integer> {

    @Query("SELECT p FROM Producto p ORDER BY p.nombre ASC")
    List<Producto> findAllByNombreASC();

}
