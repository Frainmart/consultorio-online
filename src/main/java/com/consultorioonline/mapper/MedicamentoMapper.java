package com.consultorioonline.mapper;

import com.consultorioonline.dto.medicamento.MedicamentoRequest;
import com.consultorioonline.dto.medicamento.MedicamentoResponse;
import com.consultorioonline.entity.Medicamento;

public final class MedicamentoMapper {
    private MedicamentoMapper() {}

    public static Medicamento toEntity(MedicamentoRequest dto) {
        if (dto == null) return null;
        Medicamento e = new Medicamento();
        e.setNombre(dto.getNombre());
        e.setPrincipioActivo(dto.getPrincipioActivo());
        e.setPresentacion(dto.getPresentacion());
        e.setConcentracion(dto.getConcentracion());
        e.setUnidadMedida(dto.getUnidadMedida());
        e.setEstado(dto.getEstado());
        return e;
    }

    public static MedicamentoResponse toResponse(Medicamento e) {
        if (e == null) return null;
        MedicamentoResponse dto = new MedicamentoResponse();
        dto.setIdMedicamento(e.getIdMedicamento());
        dto.setNombre(e.getNombre());
        dto.setPrincipioActivo(e.getPrincipioActivo());
        dto.setPresentacion(e.getPresentacion());
        dto.setConcentracion(e.getConcentracion());
        dto.setUnidadMedida(e.getUnidadMedida());
        dto.setEstado(e.getEstado());
        return dto;
    }
}
