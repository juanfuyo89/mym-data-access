package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="archivos", schema="mym_common")
@NamedQuery(name="Archivo.findAll", query="SELECT a FROM Archivo a")
public class Archivo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="id_etapa")
    private Integer idEtapa;

    private String path;

    @Column(name="timestamp_carga")
    private Timestamp timestampCarga;
}
