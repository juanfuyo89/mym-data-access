package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="permisos", schema="mym_common")
@NamedQuery(name="Permiso.findAll", query="SELECT p FROM Permiso p")
public class Permiso {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String descripcion;
}
