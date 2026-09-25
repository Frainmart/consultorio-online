package com.consultorioonline.mapper;

import com.consultorioonline.dto.cita.CitaRequest;
import com.consultorioonline.dto.cita.CitaResponse;
import com.consultorioonline.entity.Cita;
import com.consultorioonline.entity.Paciente;
import com.consultorioonline.entity.Agenda;
import com.consultorioonline.entity.EstadoCita;

public final class CitaMapper {
    private CitaMapper() {}

    public static Cita toEntity(CitaRequest dto) {
        if (dto == null) return null;
        Cita e = new Cita();
        e.setMotivo(dto.getMotivo());
        e.setFechaReserva(dto.getFechaReserva());
        e.setFechaCita(dto.getFechaCita());
        e.setObservaciones(dto.getObservaciones());
        e.setFechaCancelacion(dto.getFechaCancelacion());
        e.setMotivoCancelacion(dto.getMotivoCancelacion());
        if (dto.getPacienteId() != null) { Paciente r = new Paciente(); r.setIdPaciente(dto.getPacienteId()); e.setPaciente(r); }
        if (dto.getAgendaId() != null) { Agenda r = new Agenda(); r.setIdAgenda(dto.getAgendaId()); e.setAgenda(r); }
        if (dto.getEstadoCitaId() != null) { EstadoCita r = new EstadoCita(); r.setIdEstadoCita(dto.getEstadoCitaId()); e.setEstadoCita(r); }
        return e;
    }

    public static CitaResponse toResponse(Cita e) {
        if (e == null) return null;
        CitaResponse dto = new CitaResponse();
        dto.setMotivo(e.getMotivo());
        dto.setFechaReserva(e.getFechaReserva());
        dto.setFechaCita(e.getFechaCita());
        dto.setObservaciones(e.getObservaciones());
        dto.setFechaCancelacion(e.getFechaCancelacion());
        dto.setMotivoCancelacion(e.getMotivoCancelacion());
        dto.setPacienteId(e.getPaciente() != null ? e.getPaciente().getIdPaciente() : null);
        dto.setAgendaId(e.getAgenda() != null ? e.getAgenda().getIdAgenda() : null);
        dto.setEstadoCitaId(e.getEstadoCita() != null ? e.getEstadoCita().getIdEstadoCita() : null);
        return dto;
    }
}
