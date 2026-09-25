package com.consultorioonline.dto.agenda;

import java.time.LocalDate;
import java.time.LocalTime;

public class AgendaRequest {

    private Long profesionalId;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Integer estado;

    public AgendaRequest() {
    }

    public Long getProfesionalId() { return profesionalId; }

    public void setProfesionalId(Long profesionalId) { this.profesionalId = profesionalId; }

    public LocalDate getFecha() { return fecha; }

    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHoraInicio() { return horaInicio; }

    public void setHoraInicio(LocalTime horaInicio) { this.horaInicio = horaInicio; }

    public LocalTime getHoraFin() { return horaFin; }

    public void setHoraFin(LocalTime horaFin) { this.horaFin = horaFin; }

    public Integer getEstado() { return estado; }

    public void setEstado(Integer estado) { this.estado = estado; }

}
