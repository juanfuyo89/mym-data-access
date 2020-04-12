package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Data
@Entity
@Table(name="menus_roles", schema="mym_common")
@NamedQuery(name="MenuRol.findAll", query="SELECT m FROM MenuRol m")
public class MenuRol {

    @EmbeddedId
    private MenuRolPK id;

}
