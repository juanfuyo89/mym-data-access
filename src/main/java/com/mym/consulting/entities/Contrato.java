package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="contratos", schema="mym_common")
@NamedQuery(name="Contrato.findAll", query="SELECT c FROM Contrato c WHERE c.status = 'A'")
public class Contrato {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="numero_contrato")
    private String numeroContrato;

    private String nombre;

    private String status;

}
