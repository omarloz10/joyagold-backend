package com.tienda.JoyaGold.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Omar Lozano
 */
@Entity
@Table(name = "purezas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pureza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pz")
    private int id;

    @Column(name = "pz_nombre")
    String nombre;

    @ManyToOne
    @JoinColumn(name = "mtl_id")
    private Material material;

}
