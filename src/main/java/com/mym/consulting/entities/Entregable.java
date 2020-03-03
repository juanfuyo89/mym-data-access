package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="entregables", schema="mym_common")
@NamedQuery(name="Entregable.findAll", query="SELECT e FROM Entregable e")
public class Entregable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private Integer id_etapa;

    private String nombre;
}
