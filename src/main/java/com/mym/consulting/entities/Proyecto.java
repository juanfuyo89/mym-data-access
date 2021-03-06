package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name="proyectos", schema="mym_common")
@NamedQuery(name="Proyecto.findAll", query="SELECT p FROM Proyecto p WHERE p.status = 'A'")
public class Proyecto {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(targetEntity = Contrato.class)
    @JoinColumn(name="id_contrato")
    private Contrato contrato;

    @Column(name="codigo_proyecto")
    private String codigoProyecto;

    private String estado;

    @Column(name="id_cliente")
    private Integer idCliente;

    @Column(name="id_ciudad")
    private Integer idCiudad;

    @Column(name="id_equipo")
    private Integer idEquipo;

    @Column(name="forma_pago_id")
    private Integer idFormaPago;

    @Column(name="inicio_ejecucion")
    private LocalDate inicioEjecucion;

    @Column(name="fin_ejecucion")
    private LocalDate finEjecucion;

    @Column(name="inicio_prorroga")
    private LocalDate inicioProrroga;

    @Column(name="fin_prorroga")
    private LocalDate finProrroga;

    @Column(name="inicio_suspension")
    private LocalDate inicioSuspension;

    @Column(name="fin_suspension")
    private LocalDate finSuspension;

    private Integer peso;

    private String status;

}
