package com.consultorioonline.mapper;

import com.consultorioonline.dto.agenda.AgendaRequest;
import com.consultorioonline.dto.agenda.AgendaResponse;
import com.consultorioonline.entity.Agenda;
import com.consultorioonline.entity.Profesional;

public final class AgendaMapper {
    private AgendaMapper() {}

    public static Agenda toEntity(AgendaRequest dto) {
        if (dto == null) return null;
        Agenda e = new Agenda();
        e.setFecha(dto.getFecha());
        e.setHoraInicio(dto.getHoraInicio());
        e.setHoraFin(dto.getHoraFin());
        e.setEstado(dto.getEstado());
        if (dto.getProfesionalId() != null) { Profesional r = new Profesional(); r.setIdProfesional(dto.getProfesionalId()); e.setProfesional(r); }
        return e;
    }

    public static AgendaResponse toResponse(Agenda e) {
        if (e == null) return null;
        AgendaResponse dto = new AgendaResponse();
        dto.setFecha(e.getFecha());
        dto.setHoraInicio(e.getHoraInicio());
        dto.setHoraFin(e.getHoraFin());
        dto.setEstado(e.getEstado());
        dto.setProfesionalId(e.getProfesional() != null ? e.getProfesional().getIdProfesional() : null);
        return dto;
    }
}
