package com.consultorioonline.mapper;

import com.consultorioonline.dto.paciente.PacienteRequest;
import com.consultorioonline.dto.paciente.PacienteResponse;
import com.consultorioonline.entity.Paciente;
import com.consultorioonline.entity.Usuario;

public final class PacienteMapper {
    private PacienteMapper() {}

    public static Paciente toEntity(PacienteRequest dto) {
        if (dto == null) return null;
        Paciente e = new Paciente();
        e.setTipoDocumento(dto.getTipoDocumento());
        e.setNumeroDocumento(dto.getNumeroDocumento());
        e.setNombres(dto.getNombres());
        e.setApellidos(dto.getApellidos());
        e.setFechaNacimiento(dto.getFechaNacimiento());
        e.setSexo(dto.getSexo());
        e.setTelefono(dto.getTelefono());
        e.setDireccion(dto.getDireccion());
        e.setCiudad(dto.getCiudad());
        e.setEstado(dto.getEstado());
        if (dto.getUsuarioId() != null) { Usuario r = new Usuario(); r.setIdUsuario(dto.getUsuarioId()); e.setUsuario(r); }
        return e;
    }

    public static void updateEntity(com.consultorioonline.dto.paciente.PacienteUpdateRequest dto, Paciente e) {
        if (dto == null || e == null) return;
        e.setTipoDocumento(dto.getTipoDocumento()); e.setNumeroDocumento(dto.getNumeroDocumento()); e.setNombres(dto.getNombres()); e.setApellidos(dto.getApellidos()); e.setFechaNacimiento(dto.getFechaNacimiento()); e.setSexo(dto.getSexo()); e.setTelefono(dto.getTelefono()); e.setDireccion(dto.getDireccion()); e.setCiudad(dto.getCiudad()); e.setEstado(dto.getEstado());
        if (dto.getUsuarioId() != null) { Usuario r = new Usuario(); r.setIdUsuario(dto.getUsuarioId()); e.setUsuario(r); }
    }

    public static PacienteResponse toResponse(Paciente e) {
        if (e == null) return null;
        PacienteResponse dto = new PacienteResponse();
        dto.setTipoDocumento(e.getTipoDocumento());
        dto.setNumeroDocumento(e.getNumeroDocumento());
        dto.setNombres(e.getNombres());
        dto.setApellidos(e.getApellidos());
        dto.setFechaNacimiento(e.getFechaNacimiento());
        dto.setSexo(e.getSexo());
        dto.setTelefono(e.getTelefono());
        dto.setDireccion(e.getDireccion());
        dto.setCiudad(e.getCiudad());
        dto.setEstado(e.getEstado());
        dto.setUsuarioId(e.getUsuario() != null ? e.getUsuario().getIdUsuario() : null);
        return dto;
    }
}
