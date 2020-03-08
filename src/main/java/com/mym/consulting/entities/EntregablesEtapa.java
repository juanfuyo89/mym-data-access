package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Data
@Entity
@Table(name="entregables_etapas", schema="mym_common")
@NamedQuery(name="EntregablesEtapa.findAll", query="SELECT e FROM EntregablesEtapa e")
public class EntregablesEtapa {
    @EmbeddedId
    private EntregablesEtapaPK id;
}
