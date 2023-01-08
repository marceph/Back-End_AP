package com.ProyectoFinal.marceph.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Red {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la longitud")
    private String red;
    
    @NotNull
    private String link;
    
    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la longitud")
    private String icono;

    public Red() {
    }

    public Red(String red, String link, String icono) {
        this.red = red;
        this.link = link;
        this.icono = icono;
    }

}
