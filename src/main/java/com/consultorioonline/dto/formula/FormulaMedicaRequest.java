package com.consultorioonline.dto.formula;

import java.time.LocalDateTime;

public class FormulaMedicaRequest {

    private Long atencionId;
    private LocalDateTime fechaFormula;
    private String observaciones;
    private Integer estado;

    public FormulaMedicaRequest() {
    }

    public Long getAtencionId() { return atencionId; }

    public void setAtencionId(Long atencionId) { this.atencionId = atencionId; }

    public LocalDateTime getFechaFormula() { return fechaFormula; }

    public void setFechaFormula(LocalDateTime fechaFormula) { this.fechaFormula = fechaFormula; }

    public String getObservaciones() { return observaciones; }

    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public Integer getEstado() { return estado; }

    public void setEstado(Integer estado) { this.estado = estado; }

}
