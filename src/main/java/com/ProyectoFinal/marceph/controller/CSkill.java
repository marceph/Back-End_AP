package com.ProyectoFinal.marceph.controller;

import com.ProyectoFinal.marceph.entity.Skill;
import com.ProyectoFinal.marceph.service.SSkill;
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
@RequestMapping("skill")
@CrossOrigin(origins = "https://marcephz.web.app") //https://marcephz.web.app  http://localhost:4200
public class CSkill {

    @Autowired
    SSkill servSkill;

    @GetMapping("/list")
    @ResponseBody
    public List<Skill> viewSkills() {
        return servSkill.viewSkills();
    }

    @GetMapping("/view/{id}")
    @ResponseBody
    public Skill verHabilidad(@PathVariable Long id) {
        return servSkill.searchSkill(id);
    }

    @PostMapping("/create")
    public String createSkill(@RequestBody Skill ski) {
        servSkill.createSkill(ski);
        return "The skill was successfully create.";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSkill(@PathVariable Long id) {
        servSkill.deleteSkill(id);
        return "The skill was successfully removed.";
    }

    @PutMapping("/edit")
    public void editSkill(@RequestBody Skill ski) {
        servSkill.createSkill(ski);
    }

}
