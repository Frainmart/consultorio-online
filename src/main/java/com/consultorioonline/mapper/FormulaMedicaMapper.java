package com.consultorioonline.mapper;

import com.consultorioonline.dto.formula.FormulaMedicaRequest;
import com.consultorioonline.dto.formula.FormulaMedicaResponse;
import com.consultorioonline.entity.FormulaMedica;
import com.consultorioonline.entity.AtencionMedica;

public final class FormulaMedicaMapper {
    private FormulaMedicaMapper() {}

    public static FormulaMedica toEntity(FormulaMedicaRequest dto) {
        if (dto == null) return null;
        FormulaMedica e = new FormulaMedica();
        e.setFechaFormula(dto.getFechaFormula());
        e.setObservaciones(dto.getObservaciones());
        e.setEstado(dto.getEstado());
        if (dto.getAtencionId() != null) { AtencionMedica r = new AtencionMedica(); r.setIdAtencion(dto.getAtencionId()); e.setAtencion(r); }
        return e;
    }

    public static FormulaMedicaResponse toResponse(FormulaMedica e) {
        if (e == null) return null;
        FormulaMedicaResponse dto = new FormulaMedicaResponse();
        dto.setFechaFormula(e.getFechaFormula());
        dto.setObservaciones(e.getObservaciones());
        dto.setEstado(e.getEstado());
        dto.setAtencionId(e.getAtencion() != null ? e.getAtencion().getIdAtencion() : null);
        return dto;
    }
}
