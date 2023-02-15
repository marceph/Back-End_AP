package com.ProyectoFinal.marceph.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(max = 70, message = "doesn´t meet the length")
    private String skill;
    
    @Min(0)
    @Max(100)
    private int percentage;

    public Skill() {
    }

    public Skill(String skill, int percentage) {
        this.skill = skill;
        this.percentage = percentage;
    }
    
}
