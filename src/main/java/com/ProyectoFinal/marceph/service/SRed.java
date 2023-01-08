package com.ProyectoFinal.marceph.service;

import com.ProyectoFinal.marceph.entity.Red;
import com.ProyectoFinal.marceph.repository.RRed;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRed {

    @Autowired
    RRed rRed;

    public List<Red> verRedes() {
        List<Red> listaRedes = rRed.findAll();
        return listaRedes;
    }

    public void crearRed(Red red) {
        rRed.save(red);
    }

    public void borrarRed(Long id) {
        rRed.deleteById(id);
    }

    public Red buscarRed(Long id) {
        Red red = rRed.findById(id).orElse(null);
        return red;
    }

}
