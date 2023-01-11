package com.formatoweb.oracledocker.repository;

import com.formatoweb.oracledocker.entity.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Personas, Long> {
}
