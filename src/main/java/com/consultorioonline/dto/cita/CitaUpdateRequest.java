package com.consultorioonline.dto.cita;

import java.time.LocalDateTime;

public class CitaUpdateRequest {

    private Long estadoCitaId;
    private String motivo;
    private LocalDateTime fechaCita;
    private String observaciones;
    private LocalDateTime fechaCancelacion;
    private String motivoCancelacion;

    public CitaUpdateRequest() {
    }

    public Long getEstadoCitaId() { return estadoCitaId; }

    public void setEstadoCitaId(Long estadoCitaId) { this.estadoCitaId = estadoCitaId; }

    public String getMotivo() { return motivo; }

    public void setMotivo(String motivo) { this.motivo = motivo; }

    public LocalDateTime getFechaCita() { return fechaCita; }

    public void setFechaCita(LocalDateTime fechaCita) { this.fechaCita = fechaCita; }

    public String getObservaciones() { return observaciones; }

    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public LocalDateTime getFechaCancelacion() { return fechaCancelacion; }

    public void setFechaCancelacion(LocalDateTime fechaCancelacion) { this.fechaCancelacion = fechaCancelacion; }

    public String getMotivoCancelacion() { return motivoCancelacion; }

    public void setMotivoCancelacion(String motivoCancelacion) { this.motivoCancelacion = motivoCancelacion; }

}
