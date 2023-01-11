package com.formatoweb.oracledocker.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "PERSONAS", schema = "DBJORGE", catalog = "")
public class Personas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PERSONA")
    private Long idPersona;
    @Basic
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic
    @Column(name = "APELLIDO")
    private String apellido;

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personas personas = (Personas) o;
        return Objects.equals(idPersona, personas.idPersona) && Objects.equals(nombre, personas.nombre) && Objects.equals(apellido, personas.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, nombre, apellido);
    }
}
