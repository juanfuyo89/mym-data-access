package com.mym.consulting.repositories;

import com.mym.consulting.entities.Archivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<Archivo, Integer> {
}
