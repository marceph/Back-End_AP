package com.ProyectoFinal.marceph.service;

import com.ProyectoFinal.marceph.entity.Skill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ProyectoFinal.marceph.repository.RSkill;

@Service
@Transactional
public class SSkill {
    
    @Autowired
    RSkill rSkill;

    public List<Skill> viewSkills() {
        List<Skill> listSkills = rSkill.findAll();
        return listSkills;
    }

    public void createSkill(Skill ski) {
        rSkill.save(ski);
    }

    public void deleteSkill(Long id) {
        rSkill.deleteById(id);
    }

    public Skill searchSkill(Long id) {
        Skill ski = rSkill.findById(id).orElse(null);
        return ski;
    }
    
}
