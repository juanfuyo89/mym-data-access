package com.mym.consulting.repositories;

import com.mym.consulting.entities.EtapasProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StagesProjectsRepository extends JpaRepository<EtapasProyecto, Integer> {

    @Query("SELECT ep FROM EtapasProyecto ep WHERE ep.id.idProyecto = :projectId ORDER BY ep.id.idProyecto ASC")
    List<EtapasProyecto> findByIdProject(@Param("projectId") Integer projectId);

}
