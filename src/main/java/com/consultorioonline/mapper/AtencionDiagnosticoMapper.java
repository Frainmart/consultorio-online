package com.consultorioonline.mapper;

import com.consultorioonline.dto.atenciondiagnostico.AtencionDiagnosticoRequest;
import com.consultorioonline.dto.atenciondiagnostico.AtencionDiagnosticoResponse;
import com.consultorioonline.entity.AtencionDiagnostico;
import com.consultorioonline.entity.AtencionMedica;
import com.consultorioonline.entity.Diagnostico;

public final class AtencionDiagnosticoMapper {
    private AtencionDiagnosticoMapper() {}

    public static AtencionDiagnostico toEntity(AtencionDiagnosticoRequest dto) {
        if (dto == null) return null;
        AtencionDiagnostico e = new AtencionDiagnostico();
        e.setTipoDiagnostico(dto.getTipoDiagnostico());
        e.setObservaciones(dto.getObservaciones());
        if (dto.getAtencionId() != null) { AtencionMedica r = new AtencionMedica(); r.setIdAtencion(dto.getAtencionId()); e.setAtencion(r); }
        if (dto.getDiagnosticoId() != null) { Diagnostico r = new Diagnostico(); r.setIdDiagnostico(dto.getDiagnosticoId()); e.setDiagnostico(r); }
        return e;
    }

    public static AtencionDiagnosticoResponse toResponse(AtencionDiagnostico e) {
        if (e == null) return null;
        AtencionDiagnosticoResponse dto = new AtencionDiagnosticoResponse();
        dto.setTipoDiagnostico(e.getTipoDiagnostico());
        dto.setObservaciones(e.getObservaciones());
        dto.setAtencionId(e.getAtencion() != null ? e.getAtencion().getIdAtencion() : null);
        dto.setDiagnosticoId(e.getDiagnostico() != null ? e.getDiagnostico().getIdDiagnostico() : null);
        return dto;
    }
}
