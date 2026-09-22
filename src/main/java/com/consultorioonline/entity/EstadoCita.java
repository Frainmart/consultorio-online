package com.consultorioonline.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estados_cita")
public class EstadoCita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_cita")
    private Long idEstadoCita;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "estado")
    private Integer estado;

    public EstadoCita() {
    }

    public Long getIdEstadoCita() {
        return idEstadoCita;
    }

    public void setIdEstadoCita(Long idEstadoCita) {
        this.idEstadoCita = idEstadoCita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}