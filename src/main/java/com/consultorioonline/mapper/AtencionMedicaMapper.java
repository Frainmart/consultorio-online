package com.consultorioonline.mapper;

import com.consultorioonline.dto.atencion.AtencionMedicaRequest;
import com.consultorioonline.dto.atencion.AtencionMedicaResponse;
import com.consultorioonline.entity.AtencionMedica;
import com.consultorioonline.entity.Cita;

public final class AtencionMedicaMapper {
    private AtencionMedicaMapper() {}

    public static AtencionMedica toEntity(AtencionMedicaRequest dto) {
        if (dto == null) return null;
        AtencionMedica e = new AtencionMedica();
        e.setFechaAtencion(dto.getFechaAtencion());
        e.setMotivoConsulta(dto.getMotivoConsulta());
        e.setSignosRelevantes(dto.getSignosRelevantes());
        e.setObservaciones(dto.getObservaciones());
        e.setConducta(dto.getConducta());
        e.setRecomendaciones(dto.getRecomendaciones());
        if (dto.getCitaId() != null) { Cita r = new Cita(); r.setIdCita(dto.getCitaId()); e.setCita(r); }
        return e;
    }

    public static AtencionMedicaResponse toResponse(AtencionMedica e) {
        if (e == null) return null;
        AtencionMedicaResponse dto = new AtencionMedicaResponse();
        dto.setFechaAtencion(e.getFechaAtencion());
        dto.setMotivoConsulta(e.getMotivoConsulta());
        dto.setSignosRelevantes(e.getSignosRelevantes());
        dto.setObservaciones(e.getObservaciones());
        dto.setConducta(e.getConducta());
        dto.setRecomendaciones(e.getRecomendaciones());
        dto.setCitaId(e.getCita() != null ? e.getCita().getIdCita() : null);
        return dto;
    }
}
