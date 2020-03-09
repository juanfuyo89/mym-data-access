package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="clientes", schema="mym_common")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente {

    @Id
    private Integer id;

    private String contacto;

    private String direccion;

    private String nombre;

    private String telefono;

}
