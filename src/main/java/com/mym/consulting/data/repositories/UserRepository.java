package com.mym.consulting.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.mym.consulting.data.entities.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {
    @Query("SELECT u FROM mym_common.usuarios u WHERE u.userName = :user and u.password = :password")
    public Usuario findUserByUserAndPassword(@Param("user") String user, @Param("password") String password);
}
