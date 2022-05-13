package com.leanmall.microservicios.app.usuarios.models.dto;

import com.leanmall.microservicios.app.usuarios.models.entity.Alumnos;

import javax.persistence.Column;
import java.util.Date;

public class AlumnosDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

}
