package com.ProyectoFinal.marceph.controller;

import com.ProyectoFinal.marceph.entity.Proyecto;
import com.ProyectoFinal.marceph.service.SProyecto;
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
@RequestMapping("proyecto")
@CrossOrigin("*")//(origins = "https://marcephz.web.app") //https://marcephz.web.app  http://localhost:4200
public class CProyecto {

    @Autowired
    SProyecto servProy;

    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return servProy.verProyectos();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable Long id) {
        return servProy.buscarProyecto(id);
    }

    @PostMapping("/crear")
    public String agregarProyecto(@RequestBody Proyecto pro) {
        servProy.crearProyecto(pro);
        return "El Proyecto fue creado correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String eliminarProyecto(@PathVariable Long id) {
        servProy.borrarProyecto(id);
        return "El Proyecto fue borrado correctamente";
    }

    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto pro) {
        servProy.crearProyecto(pro);
    }

}
