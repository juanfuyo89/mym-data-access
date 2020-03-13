package com.mym.consulting.repositories;

import com.mym.consulting.entities.EtapasProyecto;
import com.mym.consulting.entities.UsuariosEquipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersTeamRepository extends JpaRepository<UsuariosEquipo, Integer> {

    @Query("SELECT ue FROM UsuariosEquipo ue WHERE ue.id.idEquipo = :teamId ORDER BY ue.id.idEquipo ASC")
    List<UsuariosEquipo> findByTeam(@Param("teamId") Integer teamId);

}
