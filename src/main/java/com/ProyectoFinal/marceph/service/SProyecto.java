package com.ProyectoFinal.marceph.service;

import com.ProyectoFinal.marceph.entity.Proyecto;
import com.ProyectoFinal.marceph.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {

    @Autowired
    RProyecto rProyec;

    public List<Proyecto> verProyectos() {
        List<Proyecto> listaProyectos = rProyec.findAll();
        return listaProyectos;
    }

    public void crearProyecto(Proyecto pro) {
        rProyec.save(pro);
    }

    public void borrarProyecto(Long id) {
        rProyec.deleteById(id);
    }

    public Proyecto buscarProyecto(Long id) {
        Proyecto pro = rProyec.findById(id).orElse(null);
        return pro;
    }

}
