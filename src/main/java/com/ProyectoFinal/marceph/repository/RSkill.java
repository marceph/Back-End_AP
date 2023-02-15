package com.ProyectoFinal.marceph.repository;

import com.ProyectoFinal.marceph.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkill extends JpaRepository<Skill, Long>{
    
}
