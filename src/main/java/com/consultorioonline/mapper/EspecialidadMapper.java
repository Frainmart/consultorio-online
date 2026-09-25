package com.consultorioonline.mapper;

import com.consultorioonline.dto.especialidad.EspecialidadRequest;
import com.consultorioonline.dto.especialidad.EspecialidadResponse;
import com.consultorioonline.entity.Especialidad;

public final class EspecialidadMapper {
    private EspecialidadMapper() {}

    public static Especialidad toEntity(EspecialidadRequest dto) {
        if (dto == null) return null;
        Especialidad e = new Especialidad();
        e.setNombre(dto.getNombre());
        e.setDescripcion(dto.getDescripcion());
        e.setEstado(dto.getEstado());
        return e;
    }

    public static EspecialidadResponse toResponse(Especialidad e) {
        if (e == null) return null;
        EspecialidadResponse dto = new EspecialidadResponse();
        dto.setIdEspecialidad(e.getIdEspecialidad());
        dto.setNombre(e.getNombre());
        dto.setDescripcion(e.getDescripcion());
        dto.setEstado(e.getEstado());
        return dto;
    }
}
