package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idroles;

    @Column(name = "nombre_rol")
    private String nombreRol;

    public Rol(long idroles, String nombreRol) {
        this.idroles = idroles;
        this.nombreRol = nombreRol;
    }

    public Rol(){

    }
}
