package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class EtapasProyectoPK implements Serializable {
    @Column(name="id_proyecto")
    private Integer idProyecto;

    @Column(name="id_etapa")
    private Integer idEtapa;
}
