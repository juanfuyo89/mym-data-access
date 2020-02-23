package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="roles", schema="mym_common")
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
}
