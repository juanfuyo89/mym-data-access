package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="usuarios",schema="mym_common")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u WHERE u.status = 'A'")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @Column(name="id_rol")
    private Integer idRol;

    private String password;

    private String token;

    @Column(name="username")
    private String userName;

    private String status;

}
