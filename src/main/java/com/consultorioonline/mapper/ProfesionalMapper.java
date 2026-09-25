package com.consultorioonline.mapper;

import com.consultorioonline.dto.profesional.ProfesionalRequest;
import com.consultorioonline.dto.profesional.ProfesionalResponse;
import com.consultorioonline.entity.Profesional;
import com.consultorioonline.entity.Usuario;

public final class ProfesionalMapper {
    private ProfesionalMapper() {}

    public static Profesional toEntity(ProfesionalRequest dto) {
        if (dto == null) return null;
        Profesional e = new Profesional();
        e.setTipoDocumento(dto.getTipoDocumento());
        e.setNumeroDocumento(dto.getNumeroDocumento());
        e.setNombres(dto.getNombres());
        e.setApellidos(dto.getApellidos());
        e.setRegistroProfesional(dto.getRegistroProfesional());
        e.setTelefono(dto.getTelefono());
        e.setEstado(dto.getEstado());
        if (dto.getUsuarioId() != null) { Usuario r = new Usuario(); r.setIdUsuario(dto.getUsuarioId()); e.setUsuario(r); }
        return e;
    }

    public static void updateEntity(com.consultorioonline.dto.profesional.ProfesionalUpdateRequest dto, Profesional e) {
        if (dto == null || e == null) return;
        e.setTipoDocumento(dto.getTipoDocumento()); e.setNumeroDocumento(dto.getNumeroDocumento()); e.setNombres(dto.getNombres()); e.setApellidos(dto.getApellidos()); e.setRegistroProfesional(dto.getRegistroProfesional()); e.setTelefono(dto.getTelefono()); e.setEstado(dto.getEstado());
        if (dto.getUsuarioId() != null) { Usuario r = new Usuario(); r.setIdUsuario(dto.getUsuarioId()); e.setUsuario(r); }
    }

    public static ProfesionalResponse toResponse(Profesional e) {
        if (e == null) return null;
        ProfesionalResponse dto = new ProfesionalResponse();
        dto.setTipoDocumento(e.getTipoDocumento());
        dto.setNumeroDocumento(e.getNumeroDocumento());
        dto.setNombres(e.getNombres());
        dto.setApellidos(e.getApellidos());
        dto.setRegistroProfesional(e.getRegistroProfesional());
        dto.setTelefono(e.getTelefono());
        dto.setEstado(e.getEstado());
        dto.setUsuarioId(e.getUsuario() != null ? e.getUsuario().getIdUsuario() : null);
        return dto;
    }
}
