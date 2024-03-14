package com.tienda.JoyaGold.Repositorios;

import com.tienda.JoyaGold.Entidades.Pureza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Omar Lozano
 */
@Repository
public interface RepositorioPureza extends JpaRepository<Pureza, Integer> {

}
