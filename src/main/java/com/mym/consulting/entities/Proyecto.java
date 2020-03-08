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

    @Column(name="numero_contrato")
    private String numeroContrato;

    private String nombre;

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

    private String status;

}
