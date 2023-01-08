package com.ProyectoFinal.marceph.service;

import com.ProyectoFinal.marceph.entity.Habilidad;
import com.ProyectoFinal.marceph.repository.RHabilidad;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad {
    
    @Autowired
    RHabilidad rHabilidad;

    public List<Habilidad> verHabilidades() {
        List<Habilidad> listaHabilidades = rHabilidad.findAll();
        return listaHabilidades;
    }

    public void crearHabilidad(Habilidad habi) {
        rHabilidad.save(habi);
    }

    public void borrarHabilidad(Long id) {
        rHabilidad.deleteById(id);
    }

    public Habilidad buscarHabilidad(Long id) {
        Habilidad habi = rHabilidad.findById(id).orElse(null);
        return habi;
    }
    
}
