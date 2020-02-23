package com.mym.consulting.repositories;

import com.mym.consulting.entities.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<Ciudad, Integer> {
}
