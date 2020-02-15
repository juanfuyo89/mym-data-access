package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="equipos")
@NamedQuery(name="Equipo.findAll", query="SELECT e FROM Equipo e")
public class Equipo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
}
