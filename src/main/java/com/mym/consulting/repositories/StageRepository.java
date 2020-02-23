package com.mym.consulting.repositories;

import com.mym.consulting.entities.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepository extends JpaRepository <Etapa, Integer> {
}
