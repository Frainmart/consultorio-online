package com.consultorioonline.mapper;

import com.consultorioonline.dto.diagnostico.DiagnosticoRequest;
import com.consultorioonline.dto.diagnostico.DiagnosticoResponse;
import com.consultorioonline.entity.Diagnostico;

public final class DiagnosticoMapper {
    private DiagnosticoMapper() {}

    public static Diagnostico toEntity(DiagnosticoRequest dto) {
        if (dto == null) return null;
        Diagnostico e = new Diagnostico();
        e.setCodigo(dto.getCodigo());
        e.setNombre(dto.getNombre());
        e.setDescripcion(dto.getDescripcion());
        e.setEstado(dto.getEstado());
        return e;
    }

    public static DiagnosticoResponse toResponse(Diagnostico e) {
        if (e == null) return null;
        DiagnosticoResponse dto = new DiagnosticoResponse();
        dto.setIdDiagnostico(e.getIdDiagnostico());
        dto.setCodigo(e.getCodigo());
        dto.setNombre(e.getNombre());
        dto.setDescripcion(e.getDescripcion());
        dto.setEstado(e.getEstado());
        return dto;
    }
}
