package com.ProyectoFinal.marceph.repository;

import com.ProyectoFinal.marceph.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Long>{
}
