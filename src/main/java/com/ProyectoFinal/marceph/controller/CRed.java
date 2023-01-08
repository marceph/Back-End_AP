package com.ProyectoFinal.marceph.controller;

import com.ProyectoFinal.marceph.entity.Red;
import com.ProyectoFinal.marceph.service.SRed;
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
@RequestMapping("red")
@CrossOrigin(origins = "http://localhost:4200")
public class CRed {

    @Autowired
    SRed servRed;

    @GetMapping("/lista")
    @ResponseBody
    public List<Red> verRedes() {
        return servRed.verRedes();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Red verRed(@PathVariable Long id) {
        return servRed.buscarRed(id);
    }

    @PostMapping("/crear")
    public String agregarRed(@RequestBody Red red) {
        servRed.crearRed(red);
        return "La red fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String eliminarRed(@PathVariable Long id) {
        servRed.borrarRed(id);
        return "La red fue borrada correctamente";
    }

    @PutMapping("/editar")
    public void editarRed(@RequestBody Red red) {
        servRed.crearRed(red);
    }

}
