package com.consultorioonline.dto.cita;

import java.time.LocalDateTime;

public class CitaResponse {

    private Long idCita;
    private Long pacienteId;
    private Long agendaId;
    private Long estadoCitaId;
    private String motivo;
    private LocalDateTime fechaReserva;
    private LocalDateTime fechaCita;
    private String observaciones;
    private LocalDateTime fechaCancelacion;
    private String motivoCancelacion;

    public CitaResponse() {
    }

    public Long getIdCita() { return idCita; }

    public void setIdCita(Long idCita) { this.idCita = idCita; }

    public Long getPacienteId() { return pacienteId; }

    public void setPacienteId(Long pacienteId) { this.pacienteId = pacienteId; }

    public Long getAgendaId() { return agendaId; }

    public void setAgendaId(Long agendaId) { this.agendaId = agendaId; }

    public Long getEstadoCitaId() { return estadoCitaId; }

    public void setEstadoCitaId(Long estadoCitaId) { this.estadoCitaId = estadoCitaId; }

    public String getMotivo() { return motivo; }

    public void setMotivo(String motivo) { this.motivo = motivo; }

    public LocalDateTime getFechaReserva() { return fechaReserva; }

    public void setFechaReserva(LocalDateTime fechaReserva) { this.fechaReserva = fechaReserva; }

    public LocalDateTime getFechaCita() { return fechaCita; }

    public void setFechaCita(LocalDateTime fechaCita) { this.fechaCita = fechaCita; }

    public String getObservaciones() { return observaciones; }

    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public LocalDateTime getFechaCancelacion() { return fechaCancelacion; }

    public void setFechaCancelacion(LocalDateTime fechaCancelacion) { this.fechaCancelacion = fechaCancelacion; }

    public String getMotivoCancelacion() { return motivoCancelacion; }

    public void setMotivoCancelacion(String motivoCancelacion) { this.motivoCancelacion = motivoCancelacion; }

}
