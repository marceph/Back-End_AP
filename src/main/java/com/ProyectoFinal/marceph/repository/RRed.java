package com.ProyectoFinal.marceph.repository;

import com.ProyectoFinal.marceph.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRed extends JpaRepository<Red, Long> {
}
