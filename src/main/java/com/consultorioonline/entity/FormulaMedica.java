package com.consultorioonline.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "formulas_medicas")
public class FormulaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formula")
    private Long idFormula;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_atencion", nullable = false)
    private AtencionMedica atencion;

    @Column(name = "fecha_formula", nullable = false)
    private LocalDateTime fechaFormula;

    @Column(name = "observaciones", columnDefinition = "TEXT")
    private String observaciones;

    @Column(name = "estado", nullable = false)
    private Integer estado;

    public FormulaMedica() {
    }

    public Long getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(Long idFormula) {
        this.idFormula = idFormula;
    }

    public AtencionMedica getAtencion() {
        return atencion;
    }

    public void setAtencion(AtencionMedica atencion) {
        this.atencion = atencion;
    }

    public LocalDateTime getFechaFormula() {
        return fechaFormula;
    }

    public void setFechaFormula(LocalDateTime fechaFormula) {
        this.fechaFormula = fechaFormula;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}