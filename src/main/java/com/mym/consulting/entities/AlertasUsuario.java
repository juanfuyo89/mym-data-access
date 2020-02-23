package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="alertas_usuario", schema="mym_common")
@NamedQuery(name="AlertasUsuario.findAll", query="SELECT a FROM AlertasUsuario a")
public class AlertasUsuario {
    @EmbeddedId
    private AlertasUsuarioPK id;
}
