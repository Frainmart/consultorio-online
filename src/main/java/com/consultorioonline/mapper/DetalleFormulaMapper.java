package com.consultorioonline.mapper;

import com.consultorioonline.dto.formula.DetalleFormulaRequest;
import com.consultorioonline.entity.DetalleFormula;
import com.consultorioonline.entity.FormulaMedica;
import com.consultorioonline.entity.Medicamento;

public final class DetalleFormulaMapper {
    private DetalleFormulaMapper() {}
    public static DetalleFormula toEntity(DetalleFormulaRequest dto) {
        if (dto == null) return null;
        DetalleFormula e = new DetalleFormula();
        e.setDosis(dto.getDosis()); e.setFrecuencia(dto.getFrecuencia()); e.setDuracion(dto.getDuracion()); e.setIndicaciones(dto.getIndicaciones()); e.setCantidad(dto.getCantidad());
        if (dto.getFormulaId()!=null) { FormulaMedica r=new FormulaMedica(); r.setIdFormula(dto.getFormulaId()); e.setFormula(r); }
        if (dto.getMedicamentoId()!=null) { Medicamento r=new Medicamento(); r.setIdMedicamento(dto.getMedicamentoId()); e.setMedicamento(r); }
        return e;
    }
}
