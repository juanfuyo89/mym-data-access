package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="clientes", schema="mym_common")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "client_id")
    private String clientId;

    private String contacto;

    private String direccion;

    private String nombre;

    private String telefono;

}
