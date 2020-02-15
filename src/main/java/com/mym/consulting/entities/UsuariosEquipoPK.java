package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class UsuariosEquipoPK implements Serializable {
    @Column(name="id_usuario")
    private Integer idUsuario;

    @Column(name="id_equipo")
    private Integer idEquipo;
}
