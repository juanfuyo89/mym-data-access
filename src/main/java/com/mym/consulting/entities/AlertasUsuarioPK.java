package com.mym.consulting.entities;
import lombok.Data;

import javax.persistence.*;

@Data
@Embeddable
public class AlertasUsuarioPK {
    @Column(name="id_alerta")
    private Integer idAlerta;

    @Column(name="id_usuario")
    private Integer idUsuario;

    public Integer getIdAlerta() {
        return this.idAlerta;
    }
    public void setIdAlerta(Integer idAlerta) {
        this.idAlerta = idAlerta;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertasUsuarioPK)) {
            return false;
        }
        AlertasUsuarioPK castOther = (AlertasUsuarioPK)other;
        return
                this.idAlerta.equals(castOther.idAlerta)
                        && this.idUsuario.equals(castOther.idUsuario);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.idAlerta.hashCode();
        hash = hash * prime + this.idUsuario.hashCode();

        return hash;
    }
}
