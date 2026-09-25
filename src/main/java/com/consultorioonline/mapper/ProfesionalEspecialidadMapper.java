package com.consultorioonline.mapper;

import com.consultorioonline.dto.profesionalespecialidad.ProfesionalEspecialidadRequest;
import com.consultorioonline.dto.profesionalespecialidad.ProfesionalEspecialidadResponse;
import com.consultorioonline.entity.ProfesionalEspecialidad;
import com.consultorioonline.entity.Profesional;
import com.consultorioonline.entity.Especialidad;

public final class ProfesionalEspecialidadMapper {
    private ProfesionalEspecialidadMapper() {}

    public static ProfesionalEspecialidad toEntity(ProfesionalEspecialidadRequest dto) {
        if (dto == null) return null;
        ProfesionalEspecialidad e = new ProfesionalEspecialidad();
        e.setFechaAsignacion(dto.getFechaAsignacion());
        e.setEstado(dto.getEstado());
        if (dto.getProfesionalId() != null) { Profesional r = new Profesional(); r.setIdProfesional(dto.getProfesionalId()); e.setProfesional(r); }
        if (dto.getEspecialidadId() != null) { Especialidad r = new Especialidad(); r.setIdEspecialidad(dto.getEspecialidadId()); e.setEspecialidad(r); }
        return e;
    }

    public static ProfesionalEspecialidadResponse toResponse(ProfesionalEspecialidad e) {
        if (e == null) return null;
        ProfesionalEspecialidadResponse dto = new ProfesionalEspecialidadResponse();
        dto.setFechaAsignacion(e.getFechaAsignacion());
        dto.setEstado(e.getEstado());
        dto.setProfesionalId(e.getProfesional() != null ? e.getProfesional().getIdProfesional() : null);
        dto.setEspecialidadId(e.getEspecialidad() != null ? e.getEspecialidad().getIdEspecialidad() : null);
        return dto;
    }
}
