package com.mym.consulting.repositories;

import com.mym.consulting.entities.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Proyecto, Integer> {

    @Query("SELECT p FROM Proyecto p WHERE p.contrato.id = :contractId ORDER BY p.id ASC")
    List<Proyecto> findByContract(@Param("contractId") Integer contractId);

}
