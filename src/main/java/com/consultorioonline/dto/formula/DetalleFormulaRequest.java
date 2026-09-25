package com.consultorioonline.dto.formula;

import java.math.BigDecimal;

public class DetalleFormulaRequest {

    private Long formulaId;
    private Long medicamentoId;
    private String dosis;
    private String frecuencia;
    private String duracion;
    private String indicaciones;
    private BigDecimal cantidad;

    public DetalleFormulaRequest() {
    }

    public Long getFormulaId() { return formulaId; }

    public void setFormulaId(Long formulaId) { this.formulaId = formulaId; }

    public Long getMedicamentoId() { return medicamentoId; }

    public void setMedicamentoId(Long medicamentoId) { this.medicamentoId = medicamentoId; }

    public String getDosis() { return dosis; }

    public void setDosis(String dosis) { this.dosis = dosis; }

    public String getFrecuencia() { return frecuencia; }

    public void setFrecuencia(String frecuencia) { this.frecuencia = frecuencia; }

    public String getDuracion() { return duracion; }

    public void setDuracion(String duracion) { this.duracion = duracion; }

    public String getIndicaciones() { return indicaciones; }

    public void setIndicaciones(String indicaciones) { this.indicaciones = indicaciones; }

    public BigDecimal getCantidad() { return cantidad; }

    public void setCantidad(BigDecimal cantidad) { this.cantidad = cantidad; }

}
