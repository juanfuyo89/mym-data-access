package com.mym.consulting.repositories;

import com.mym.consulting.entities.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Equipo, Integer> {
}
