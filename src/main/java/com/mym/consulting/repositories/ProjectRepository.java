package com.mym.consulting.repositories;

import com.mym.consulting.entities.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Proyecto, Integer> {
}
