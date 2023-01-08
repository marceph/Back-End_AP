package com.ProyectoFinal.marceph.service;

import com.ProyectoFinal.marceph.entity.Experiencia;
import com.ProyectoFinal.marceph.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {

    @Autowired
    RExperiencia rExpe;

    public List<Experiencia> verExperiencias() {
        List<Experiencia> listaExperiencias = rExpe.findAll();
        return listaExperiencias;
    }

    public void crearExperiencia(Experiencia exp) {
        rExpe.save(exp);
    }

    public void borrarExperiencia(Long id) {
        rExpe.deleteById(id);
    }

    public Experiencia buscarExperiencia(Long id) {
        Experiencia exp = rExpe.findById(id).orElse(null);
        return exp;
    }

}
