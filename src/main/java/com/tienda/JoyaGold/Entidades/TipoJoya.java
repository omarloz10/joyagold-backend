package com.tienda.JoyaGold.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Omar Lozano
 */
@Entity
@Table(name = "tipo_joya")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoJoya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tj")
    private int id;

    @Column(name = "tj_nombre")
    private String nombre;

}
