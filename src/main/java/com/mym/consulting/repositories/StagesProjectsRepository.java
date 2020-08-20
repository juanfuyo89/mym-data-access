package com.mym.consulting.repositories;

import com.mym.consulting.entities.EtapasProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StagesProjectsRepository extends JpaRepository<EtapasProyecto, Integer> {

    @Query("SELECT ep FROM EtapasProyecto ep WHERE ep.id.idProyecto = :projectId ORDER BY ep.id.idEtapa ASC")
    List<EtapasProyecto> findByIdProject(@Param("projectId") Integer projectId);

    @Query("SELECT ep FROM EtapasProyecto ep WHERE ep.id.idProyecto = :projectId AND ep.id.idEtapa = :stageId ")
    EtapasProyecto findById(@Param("projectId") Integer projectId, @Param("stageId") Integer stageId);

}
