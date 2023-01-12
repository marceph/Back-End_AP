package com.ProyectoFinal.marceph.controller;

import com.ProyectoFinal.marceph.entity.Education;
import com.ProyectoFinal.marceph.service.SEducation;
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
@RequestMapping("estudio")
@CrossOrigin(origins = "https://marcephz.web.app") //https://marcephz.web.app  http://localhost:4200
public class CEducation {

    @Autowired
    SEducation servEdu;

    @GetMapping("/lista")
    @ResponseBody
    public List<Education> verEstudios() {
        return servEdu.verEstudios();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Education verEstudio(@PathVariable Long id) {
        return servEdu.buscarEstudio(id);
    }

    @PostMapping("/crear")
    public String agregarEstudio(@RequestBody Education edu) {
        servEdu.crearEstudio(edu);
        return "El Estudio fue creado correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String eliminarEstudio(@PathVariable Long id) {
        servEdu.borrarEstudio(id);
        return "El Estudio fue borrado correctamente";
    }
    
    @PutMapping("/editar")
    public void editarEstudio(@RequestBody Education edu) {
        servEdu.crearEstudio(edu);
    }

}
