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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 80, message = "No cumple con la longitud")
    private String titulo;
    
    @NotNull
    @Size(min = 1, max = 400, message = "No cumple con la longitud")
    private String aboutme;
    
    @NotNull
    @Size(min = 1, max = 400, message = "No cumple con la longitud")
    private String banner;
    
    @NotNull
    @Size(min = 1, max = 400, message = "No cumple con la longitud")
    private String img;
    
    @Size(min = 1, max = 45, message = "No cumple con la longitud")
    private String username;
    
    @NotNull
    @Size(min = 1, max = 400, message = "No cumple con la longitud")
    private String cv;
    
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String email;
    
    @Size(min = 4, max = 20, message = "No cumple con la longitud")
    private String password;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String titulo, String aboutme, String banner, String img, String username, String cv, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.aboutme = aboutme;
        this.banner = banner;
        this.img = img;
        this.username = username;
        this.cv = cv;
        this.email = email;
        this.password = password;
    }
    
    
}
