package com.mym.consulting.repositories;

import com.mym.consulting.entities.MenuRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRolRepository extends JpaRepository<MenuRol, Integer> {

    @Query("SELECT mr FROM MenuRol mr WHERE mr.id.idRol = :idRole")
    List<MenuRol> findByIdRole(@Param("idRole") Integer idRole);

}
