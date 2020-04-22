package com.mym.consulting.repositories;

import com.mym.consulting.entities.EntregablesEtapa;
import com.mym.consulting.entities.EntregablesEtapaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeliverableStagesRepository extends JpaRepository<EntregablesEtapa, Integer> {

    @Query("SELECT e FROM EntregablesEtapa e WHERE e.id.idProyecto = :projectId ORDER BY e.id.idProyecto ASC")
    List<EntregablesEtapa> findByIdProject(@Param("projectId") Integer projectId);

    @Query("SELECT e FROM EntregablesEtapa e WHERE e.id.idProyecto = :projectId AND e.id.idEtapa = :stageId " +
            "AND e.id.idEntregable = :deliverableId")
    EntregablesEtapa findById(@Param("projectId") Integer projectId, @Param("stageId") Integer stageId,
                              @Param("deliverableId") Integer deliverableId);

}
