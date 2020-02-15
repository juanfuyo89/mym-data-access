package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
public class PermisosRolPK {
    @Column(name="id_rol")
    private Integer idRol;

    @Column(name="id_permiso")
    private Integer idPermiso;


    public Integer getIdRol() {
        return this.idRol;
    }
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }
    public Integer getIdPermiso() {
        return this.idPermiso;
    }
    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermisosRolPK)) {
            return false;
        }
        PermisosRolPK castOther = (PermisosRolPK)other;
        return
                this.idRol.equals(castOther.idRol)
                        && this.idPermiso.equals(castOther.idPermiso);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.idRol.hashCode();
        hash = hash * prime + this.idPermiso.hashCode();

        return hash;
    }
}
