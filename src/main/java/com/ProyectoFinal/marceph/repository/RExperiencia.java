package com.ProyectoFinal.marceph.repository;

import com.ProyectoFinal.marceph.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Long> {
}
