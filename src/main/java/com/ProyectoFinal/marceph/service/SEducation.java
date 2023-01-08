package com.ProyectoFinal.marceph.service;

import com.ProyectoFinal.marceph.entity.Education;
import com.ProyectoFinal.marceph.repository.REstudio;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducation {

    @Autowired
    REstudio rEstudio;

    public List<Education> verEstudios() {
        List<Education> listaEstudios = rEstudio.findAll();
        return listaEstudios;
    }

    public void crearEstudio(Education edu) {
        rEstudio.save(edu);
    }

    public void borrarEstudio(Long id) {
        rEstudio.deleteById(id);
    }

    public Education buscarEstudio(Long id) {
        Education edu = rEstudio.findById(id).orElse(null);
        return edu;
    }

}
