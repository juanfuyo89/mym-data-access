package com.mym.consulting.repositories;

import com.mym.consulting.entities.UsuariosEquipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTeamRepository extends JpaRepository<UsuariosEquipo, Integer> {
}
