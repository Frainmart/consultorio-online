package com.consultorioonline.dto.profesionalespecialidad;

import java.time.LocalDateTime;

public class ProfesionalEspecialidadRequest {

    private Long profesionalId;
    private Long especialidadId;
    private LocalDateTime fechaAsignacion;
    private Integer estado;

    public ProfesionalEspecialidadRequest() {
    }

    public Long getProfesionalId() { return profesionalId; }

    public void setProfesionalId(Long profesionalId) { this.profesionalId = profesionalId; }

    public Long getEspecialidadId() { return especialidadId; }

    public void setEspecialidadId(Long especialidadId) { this.especialidadId = especialidadId; }

    public LocalDateTime getFechaAsignacion() { return fechaAsignacion; }

    public void setFechaAsignacion(LocalDateTime fechaAsignacion) { this.fechaAsignacion = fechaAsignacion; }

    public Integer getEstado() { return estado; }

    public void setEstado(Integer estado) { this.estado = estado; }

}
