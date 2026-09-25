package com.consultorioonline.mapper;

import com.consultorioonline.dto.auditoria.AuditoriaRequest;
import com.consultorioonline.dto.auditoria.AuditoriaResponse;
import com.consultorioonline.entity.Auditoria;
import com.consultorioonline.entity.Usuario;

public final class AuditoriaMapper {
    private AuditoriaMapper() {}

    public static Auditoria toEntity(AuditoriaRequest dto) {
        if (dto == null) return null;
        Auditoria e = new Auditoria();
        e.setFechaHora(dto.getFechaHora());
        e.setAccion(dto.getAccion());
        e.setEntidad(dto.getEntidad());
        e.setIdentificadorRegistro(dto.getIdentificadorRegistro());
        e.setDescripcion(dto.getDescripcion());
        e.setDireccionIp(dto.getDireccionIp());
        if (dto.getUsuarioId() != null) { Usuario r = new Usuario(); r.setIdUsuario(dto.getUsuarioId()); e.setUsuario(r); }
        return e;
    }

    public static AuditoriaResponse toResponse(Auditoria e) {
        if (e == null) return null;
        AuditoriaResponse dto = new AuditoriaResponse();
        dto.setFechaHora(e.getFechaHora());
        dto.setAccion(e.getAccion());
        dto.setEntidad(e.getEntidad());
        dto.setIdentificadorRegistro(e.getIdentificadorRegistro());
        dto.setDescripcion(e.getDescripcion());
        dto.setDireccionIp(e.getDireccionIp());
        dto.setUsuarioId(e.getUsuario() != null ? e.getUsuario().getIdUsuario() : null);
        return dto;
    }
}
