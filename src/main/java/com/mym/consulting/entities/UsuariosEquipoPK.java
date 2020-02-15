package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Embeddable
public class UsuariosEquipoPK {
    @Column(name="id_usuario")
    private Integer idUsuario;

    @Column(name="id_equipo")
    private Integer idEquipo;
}
