package com.mym.consulting.repositories;

import com.mym.consulting.entities.EntregablesEtapa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliverableStagesRepository extends JpaRepository<EntregablesEtapa, Integer> {
}
