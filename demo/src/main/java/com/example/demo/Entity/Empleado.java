package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idempleados;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo_electronico")
    private String correo_electronico;

    @Column(name = "direccion")
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "idroles")
    private Rol idroles;

    public Empleado(long idempleados, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String correo_electronico, String direccion) {
        this.idempleados = idempleados;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.direccion = direccion;
    }

    public Empleado() {

    }
}
