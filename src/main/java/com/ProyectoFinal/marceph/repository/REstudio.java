package com.ProyectoFinal.marceph.repository;

import com.ProyectoFinal.marceph.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudio extends JpaRepository<Education, Long> {
}
