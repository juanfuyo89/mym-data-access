package com.mym.consulting.repositories;

import com.mym.consulting.entities.Alerta;
import com.mym.consulting.entities.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertRepository extends JpaRepository<Alerta, Integer>{
    @Query("SELECT a FROM Alerta a WHERE a.leida = 'N' ORDER BY a.id ASC")
    List<Alerta> findAll();
}
