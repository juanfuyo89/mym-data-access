package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="valor", schema="mym_common")
@NamedQuery(name="Valor.findAll", query="SELECT v FROM Valor v")
public class Valor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="id_proyecto")
    private Integer idProyecto;

    private double total;
}
