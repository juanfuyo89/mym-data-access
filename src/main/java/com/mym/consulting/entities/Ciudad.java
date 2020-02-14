package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name="ciudades")
@NamedQuery(name="Ciudade.findAll", query="SELECT c FROM Ciudade c")
public class Ciudad {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
}
