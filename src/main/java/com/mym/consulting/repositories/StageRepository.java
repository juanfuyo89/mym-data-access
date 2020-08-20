package com.mym.consulting.repositories;

import com.mym.consulting.entities.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StageRepository extends JpaRepository <Etapa, Integer> {
    @Query("SELECT e FROM Etapa e ORDER BY e.id ASC")
    List<Etapa> findAll();
}
