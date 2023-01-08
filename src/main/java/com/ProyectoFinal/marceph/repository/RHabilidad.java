package com.ProyectoFinal.marceph.repository;

import com.ProyectoFinal.marceph.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository<Habilidad, Long>{
    
}
