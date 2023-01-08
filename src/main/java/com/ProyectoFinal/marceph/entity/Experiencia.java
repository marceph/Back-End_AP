package com.ProyectoFinal.marceph.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la longitud")
    private String experiencia;

    @Temporal(TemporalType.DATE)
    private Date inicio;

    @Temporal(TemporalType.DATE)
    private Date fin;

    @NotNull
    private String description;

    @NotNull
    private String logo;

    public Experiencia() {
    }

    public Experiencia(String experiencia, Date inicio, Date fin, String description, String logo) {
        this.experiencia = experiencia;
        this.inicio = inicio;
        this.fin = fin;
        this.description = description;
        this.logo = logo;
    }
    
}
