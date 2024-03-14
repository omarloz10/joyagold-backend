package com.tienda.JoyaGold.Repositorios;

import com.tienda.JoyaGold.Entidades.Talla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Omar Lozano
 */
@Repository
public interface RepositorioTalla extends JpaRepository<Talla, Integer> {

}
