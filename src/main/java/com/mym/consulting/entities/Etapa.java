package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="etapas", schema="mym_common")
@NamedQuery(name="Etapa.findAll", query="SELECT e FROM Etapa e")
public class Etapa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

}
