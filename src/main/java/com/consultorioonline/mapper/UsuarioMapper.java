package com.consultorioonline.mapper;

import com.consultorioonline.dto.usuario.UsuarioRequest;
import com.consultorioonline.dto.usuario.UsuarioResponse;
import com.consultorioonline.dto.usuario.UsuarioUpdateRequest;
import com.consultorioonline.entity.Rol;
import com.consultorioonline.entity.Usuario;

public final class UsuarioMapper {

    private UsuarioMapper() {
    }

    public static Usuario toEntity(UsuarioRequest dto) {
        if (dto == null) {
            return null;
        }

        Usuario e = new Usuario();

        e.setCorreoElectronico(dto.getCorreoElectronico());
        e.setContrasenaHash(dto.getContrasena());
        e.setTipoDocumento(dto.getTipoDocumento());

        if (dto.getRolId() != null) {
            Rol r = new Rol();
            r.setIdRol(dto.getRolId());
            e.setRol(r);
        }

        return e;
    }

    public static void updateEntity(UsuarioUpdateRequest dto, Usuario e) {
        if (dto == null || e == null) {
            return;
        }

        e.setCorreoElectronico(dto.getCorreoElectronico());
        e.setTipoDocumento(dto.getTipoDocumento());

        if (dto.getRolId() != null) {
            Rol r = new Rol();
            r.setIdRol(dto.getRolId());
            e.setRol(r);
        }
    }

    public static UsuarioResponse toResponse(Usuario e) {
        if (e == null) {
            return null;
        }

        UsuarioResponse dto = new UsuarioResponse();

        dto.setIdUsuario(e.getIdUsuario());
        dto.setCorreoElectronico(e.getCorreoElectronico());
        dto.setTipoDocumento(e.getTipoDocumento());

        dto.setRolId(
            e.getRol() != null
                ? e.getRol().getIdRol()
                : null
        );

        dto.setFechaCreacion(e.getFechaCreacion());
        dto.setFechaActualizacion(e.getFechaActualizacion());

        return dto;
    }
}