package com.consultorioonline.dto.atencion;

import java.time.LocalDateTime;

public class AtencionMedicaResponse {

    private Long idAtencion;
    private Long citaId;
    private LocalDateTime fechaAtencion;
    private String motivoConsulta;
    private String signosRelevantes;
    private String observaciones;
    private String conducta;
    private String recomendaciones;

    public AtencionMedicaResponse() {
    }

    public Long getIdAtencion() { return idAtencion; }

    public void setIdAtencion(Long idAtencion) { this.idAtencion = idAtencion; }

    public Long getCitaId() { return citaId; }

    public void setCitaId(Long citaId) { this.citaId = citaId; }

    public LocalDateTime getFechaAtencion() { return fechaAtencion; }

    public void setFechaAtencion(LocalDateTime fechaAtencion) { this.fechaAtencion = fechaAtencion; }

    public String getMotivoConsulta() { return motivoConsulta; }

    public void setMotivoConsulta(String motivoConsulta) { this.motivoConsulta = motivoConsulta; }

    public String getSignosRelevantes() { return signosRelevantes; }

    public void setSignosRelevantes(String signosRelevantes) { this.signosRelevantes = signosRelevantes; }

    public String getObservaciones() { return observaciones; }

    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public String getConducta() { return conducta; }

    public void setConducta(String conducta) { this.conducta = conducta; }

    public String getRecomendaciones() { return recomendaciones; }

    public void setRecomendaciones(String recomendaciones) { this.recomendaciones = recomendaciones; }

}
