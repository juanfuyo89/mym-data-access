package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="menus", schema="mym_common")
@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m")
public class Menu {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String path;

    private String title;

    private String icon;
}
