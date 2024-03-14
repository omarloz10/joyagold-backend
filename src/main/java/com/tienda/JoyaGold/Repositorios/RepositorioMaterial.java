package com.tienda.JoyaGold.Repositorios;

import com.tienda.JoyaGold.Entidades.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Omar Lozano
 */
@Repository
public interface RepositorioMaterial extends JpaRepository<Material, Integer> {
    
}
