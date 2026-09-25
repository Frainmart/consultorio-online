package com.consultorioonline.mapper;

import com.consultorioonline.dto.rol.RolRequest;
import com.consultorioonline.dto.rol.RolResponse;
import com.consultorioonline.entity.Rol;

public final class RolMapper {
    private RolMapper() {}

    public static Rol toEntity(RolRequest dto) {
        if (dto == null) return null;
        Rol e = new Rol();
        e.setNombre(dto.getNombre());
        e.setDescripcion(dto.getDescripcion());
        e.setEstado(dto.getEstado());
        return e;
    }

    public static RolResponse toResponse(Rol e) {
        if (e == null) return null;
        RolResponse dto = new RolResponse();
        dto.setIdRol(e.getIdRol());
        dto.setNombre(e.getNombre());
        dto.setDescripcion(e.getDescripcion());
        dto.setEstado(e.getEstado());
        return dto;
    }
}
