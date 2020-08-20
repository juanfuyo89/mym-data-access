package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="etapas_proyectos", schema="mym_common")
@NamedQuery(name="EtapasProyecto.findAll", query="SELECT e FROM EtapasProyecto e")
public class EtapasProyecto {
    @EmbeddedId
    private EtapasProyectoPK id;
    private Integer peso;
}
