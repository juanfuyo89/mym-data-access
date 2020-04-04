package com.mym.consulting.repositories;

import com.mym.consulting.entities.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contrato, Integer> {
}
