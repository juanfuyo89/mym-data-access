package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name="ciudades", schema="mym_common")
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
}
