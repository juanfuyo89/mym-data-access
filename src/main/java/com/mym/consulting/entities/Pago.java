package com.mym.consulting.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="pagos")
@NamedQuery(name="Pago.findAll", query="SELECT p FROM Pago p")
public class Pago {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name="id_valor")
    private Integer idValor;

    @Column(name="valor_pago")
    private double valorPago;
}
