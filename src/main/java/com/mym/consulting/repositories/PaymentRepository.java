package com.mym.consulting.repositories;

import com.mym.consulting.entities.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Pago, Integer> {

    @Query("SELECT p FROM Pago p WHERE p.idValor = :valueId ORDER BY p.fecha DESC")
    List<Pago> findByIdValue(@Param("valueId") Integer valueId);

}
