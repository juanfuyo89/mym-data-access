package com.mym.consulting.repositories;

import com.mym.consulting.entities.EtapasProyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StagesProjectsRepository extends JpaRepository<EtapasProyecto, Integer> {
}
