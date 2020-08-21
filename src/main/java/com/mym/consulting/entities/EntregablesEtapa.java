package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name="entregables_etapas", schema="mym_common")
@NamedQuery(name="EntregablesEtapa.findAll", query="SELECT e FROM EntregablesEtapa e")
public class EntregablesEtapa {
    @EmbeddedId
    private EntregablesEtapaPK id;
    @Column(name="id_archivo")
    private Integer idArchivo;
    private Integer peso;
    private String estado;
    @Column(name="fecha_entrega")
    private Date fechaEntrega;
}
