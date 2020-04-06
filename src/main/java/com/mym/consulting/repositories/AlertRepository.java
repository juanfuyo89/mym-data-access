package com.mym.consulting.repositories;

import com.mym.consulting.entities.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends JpaRepository<Alerta, Integer>{
}
