package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="permisos_roles")
@NamedQuery(name="PermisosRole.findAll", query="SELECT p FROM PermisosRole p")
public class PermisosRol {
    @EmbeddedId
    private PermisosRolPK id;
}
