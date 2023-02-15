package com.ProyectoFinal.marceph.service;

import com.ProyectoFinal.marceph.entity.Persona;
import com.ProyectoFinal.marceph.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    
    @Autowired
    RPersona rPersona;

    public List<Persona> verPersonas() {
        List<Persona> listaPersonas = rPersona.findAll();
        return listaPersonas;
    }

    public void crearPersona(Persona per) {
        rPersona.save(per);
    }

    public void borrarPersona(Long id) {
        rPersona.deleteById(id);
    }

    public Persona buscarPersona(Long id) {
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }

    public Persona loginPersona(String email, String password) {
        List<Persona> personas = rPersona.findByEmailAndPassword(email, password);
        
        if(!personas.isEmpty()){
            return personas.get(0);                        
        }
        return null;
    }   
    
}