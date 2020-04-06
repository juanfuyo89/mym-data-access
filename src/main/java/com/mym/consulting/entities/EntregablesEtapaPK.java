package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class EntregablesEtapaPK implements Serializable {

    @Column(name="id_etapa")
    private Integer idEtapa;

    @Column(name="id_entregable")
    private Integer idEntregable;

    @Column(name="id_proyecto")
    private Integer idProyecto;

    private Integer peso;

}
