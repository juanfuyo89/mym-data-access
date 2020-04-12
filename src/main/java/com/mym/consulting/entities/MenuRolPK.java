package com.mym.consulting.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
public class MenuRolPK implements Serializable {

    @Column(name="id_rol")
    private Integer idRol;

    @ManyToOne(targetEntity = Menu.class)
    @JoinColumn(name="id_menu")
    private Menu menu;

}
