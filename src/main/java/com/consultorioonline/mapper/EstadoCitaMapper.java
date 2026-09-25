package com.consultorioonline.mapper;

import com.consultorioonline.dto.estado.EstadoCitaRequest;
import com.consultorioonline.dto.estado.EstadoCitaResponse;
import com.consultorioonline.entity.EstadoCita;

public final class EstadoCitaMapper {
    private EstadoCitaMapper() {}

    public static EstadoCita toEntity(EstadoCitaRequest dto) {
        if (dto == null) return null;
        EstadoCita e = new EstadoCita();
        e.setNombre(dto.getNombre());
        e.setDescripcion(dto.getDescripcion());
        e.setEstado(dto.getEstado());
        return e;
    }

    public static EstadoCitaResponse toResponse(EstadoCita e) {
        if (e == null) return null;
        EstadoCitaResponse dto = new EstadoCitaResponse();
        dto.setIdEstadoCita(e.getIdEstadoCita());
        dto.setNombre(e.getNombre());
        dto.setDescripcion(e.getDescripcion());
        dto.setEstado(e.getEstado());
        return dto;
    }
}
