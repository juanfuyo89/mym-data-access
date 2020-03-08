package com.mym.consulting.repositories;

import com.mym.consulting.entities.FormaPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends JpaRepository<FormaPago, Integer> {
}
