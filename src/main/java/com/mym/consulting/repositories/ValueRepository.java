package com.mym.consulting.repositories;

import com.mym.consulting.entities.Valor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValueRepository extends JpaRepository<Valor, Integer> {
}
