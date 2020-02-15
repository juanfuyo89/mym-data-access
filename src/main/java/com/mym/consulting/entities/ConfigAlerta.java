package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="config_alertas")
@NamedQuery(name="ConfigAlerta.findAll", query="SELECT c FROM ConfigAlerta c")
public class ConfigAlerta {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String description;
}
