package com.consultorioonline.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "detalles_formula")
public class DetalleFormula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_formula")
    private Long idDetalleFormula;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_formula", nullable = false)
    private FormulaMedica formula;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_medicamento", nullable = false)
    private Medicamento medicamento;

    @Column(name = "dosis", length = 100, nullable = false)
    private String dosis;

    @Column(name = "frecuencia", length = 100, nullable = false)
    private String frecuencia;

    @Column(name = "duracion", length = 100, nullable = false)
    private String duracion;

    @Column(name = "indicaciones", columnDefinition = "TEXT")
    private String indicaciones;

    @Column(name = "cantidad", precision = 10, scale = 2, nullable = false)
    private BigDecimal cantidad;

    public DetalleFormula() {
    }

    public Long getIdDetalleFormula() {
        return idDetalleFormula;
    }

    public void setIdDetalleFormula(Long idDetalleFormula) {
        this.idDetalleFormula = idDetalleFormula;
    }

    public FormulaMedica getFormula() {
        return formula;
    }

    public void setFormula(FormulaMedica formula) {
        this.formula = formula;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
}