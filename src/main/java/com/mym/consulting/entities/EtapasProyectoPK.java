package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Embeddable
public class EtapasProyectoPK {
    @Column(name="id_proyecto")
    private Integer idProyecto;

    @Column(name="id_etapa")
    private Integer idEtapa;
}
