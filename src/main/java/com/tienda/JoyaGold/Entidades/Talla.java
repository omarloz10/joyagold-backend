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
@Table(name = "tallas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Talla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tl")
    private int id;

    @Column(name = "tl_nombre")
    private String nombre;

    @Column(name = "tl_descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "tj_id")
    private TipoJoya tipoJoya;
}
