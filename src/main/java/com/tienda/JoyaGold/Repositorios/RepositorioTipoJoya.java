package com.tienda.JoyaGold.Repositorios;

import com.tienda.JoyaGold.Entidades.TipoJoya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Omar Lozano
 */
@Repository
public interface RepositorioTipoJoya extends JpaRepository<TipoJoya, Integer> {

}
