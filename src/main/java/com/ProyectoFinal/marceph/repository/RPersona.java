package com.ProyectoFinal.marceph.repository;

import com.ProyectoFinal.marceph.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Long>{
    public List<Persona> findByEmailAndPassword(String email, String password);
}
