package com.ProyectoFinal.marceph.controller;

import com.ProyectoFinal.marceph.entity.Habilidad;
import com.ProyectoFinal.marceph.service.SHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("habilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad {

    @Autowired
    SHabilidad servHabi;

    @GetMapping("/lista")
    @ResponseBody
    public List<Habilidad> verHabilidades() {
        return servHabi.verHabilidades();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Habilidad verHabilidad(@PathVariable Long id) {
        return servHabi.buscarHabilidad(id);
    }

    @PostMapping("/crear")
    public String agregarHabilidad(@RequestBody Habilidad habi) {
        servHabi.crearHabilidad(habi);
        return "La habilidad fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String eliminarHabilidad(@PathVariable Long id) {
        servHabi.borrarHabilidad(id);
        return "La habilidad fue borrada correctamente";
    }

    @PutMapping("/editar")
    public void editarHabilidad(@RequestBody Habilidad habi) {
        servHabi.crearHabilidad(habi);
    }

}
