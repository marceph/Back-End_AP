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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la longitud")
    private String proyecto;

    @Temporal(TemporalType.DATE)
    private Date fin;

    @NotNull
    private String description;
    
    private String link;

    @NotNull
    private String logo;

    public Proyecto() {
    }

    public Proyecto(String proyecto, Date fin, String description, String link, String logo) {
        this.proyecto = proyecto;
        this.fin = fin;
        this.description = description;
        this.link = link;
        this.logo = logo;
    }
    
}
