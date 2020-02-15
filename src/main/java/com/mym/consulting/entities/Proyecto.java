package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="proyectos")
@NamedQuery(name="Proyecto.findAll", query="SELECT p FROM Proyecto p")
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String estado;

    @Column(name="id_ciudad")
    private Integer idCiudad;

    @Column(name="id_cliente")
    private Integer idCliente;

    @Column(name="id_equipo")
    private Integer idEquipo;

    private String nombre;
}
