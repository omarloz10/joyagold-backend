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
@Table(name = "productos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prod")
    private int id;

    @Column(name = "prod_nombre")
    private String nombre;

    @Column(name = "prod_precio", columnDefinition = "DECIMAL")
    private double precio;

    @Column(name = "prod_color")
    private String color;

    @Column(name = "prod_peso")
    private String peso;

    @ManyToOne
    @JoinColumn(name = "tj_id")
    TipoJoya tipo;

    @ManyToOne
    @JoinColumn(name = "mtl_id")
    Material material;

    @ManyToOne
    @JoinColumn(name = "tl_id")
    private Talla talla;

    @ManyToOne
    @JoinColumn(name = "pz_id")
    private Pureza pureza;

}
