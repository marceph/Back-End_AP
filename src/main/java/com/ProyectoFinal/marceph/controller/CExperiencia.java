package com.ProyectoFinal.marceph.controller;

import com.ProyectoFinal.marceph.entity.Experiencia;
import com.ProyectoFinal.marceph.service.SExperiencia;
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
@RequestMapping("experiencia")
@CrossOrigin("*")//(origins = "https://marcephz.web.app") //https://marcephz.web.app  http://localhost:4200
public class CExperiencia {

    @Autowired
    SExperiencia servExp;

    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return servExp.verExperiencias();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable Long id) {
        return servExp.buscarExperiencia(id);
    }

    @PostMapping("/crear")
    public String agregarExperiencia(@RequestBody Experiencia exp) {
        servExp.crearExperiencia(exp);
        return "La Experiencia fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable Long id) {
        servExp.borrarExperiencia(id);
        return "La Experiencia fue borrada correctamente";
    }

    @PutMapping("/editar")
    public void editarExperiencia(@RequestBody Experiencia exp) {
        servExp.crearExperiencia(exp);
    }

}
