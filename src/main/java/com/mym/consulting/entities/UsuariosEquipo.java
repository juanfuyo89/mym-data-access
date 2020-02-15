package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="usuarios_equipos")
@NamedQuery(name="UsuariosEquipo.findAll", query="SELECT u FROM UsuariosEquipo u")
public class UsuariosEquipo {
    @EmbeddedId
    private UsuariosEquipoPK id;

    @Column(name="es_lider")
    private Boolean esLider;
}
