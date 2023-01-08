package com.ProyectoFinal.marceph.repository;

import com.ProyectoFinal.marceph.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RProyecto extends JpaRepository<Proyecto, Long> {
}
