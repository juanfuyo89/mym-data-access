package com.mym.consulting.repositories;

import com.mym.consulting.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Integer> {

}
