package com.mym.consulting.repositories;

import com.mym.consulting.entities.EtapasProyecto;
import com.mym.consulting.entities.Valor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ValueRepository extends JpaRepository<Valor, Integer> {

    @Query("SELECT v FROM Valor v WHERE v.idProyecto = :projectId ORDER BY v.idProyecto ASC")
    Valor findByIdProject(@Param("projectId") Integer projectId);

}
