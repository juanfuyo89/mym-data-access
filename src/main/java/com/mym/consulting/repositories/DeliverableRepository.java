package com.mym.consulting.repositories;

import com.mym.consulting.entities.Entregable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliverableRepository extends JpaRepository<Entregable, Integer> {
}
