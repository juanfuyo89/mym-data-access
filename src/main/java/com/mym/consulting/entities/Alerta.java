package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="alertas")
@NamedQuery(name="Alerta.findAll", query="SELECT a FROM Alerta a")
public class Alerta {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name="id_config")
    private Integer idConfig;

    private String mensaje;

    @Column(name="timestamp_alerta")
    private Timestamp timestampAlerta;
}
