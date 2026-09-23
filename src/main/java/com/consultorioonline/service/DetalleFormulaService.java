package com.consultorioonline.service;

import com.consultorioonline.entity.DetalleFormula;

import java.util.List;
import java.util.Optional;

public interface DetalleFormulaService {

    DetalleFormula guardar(DetalleFormula detalleFormula);

    Optional<DetalleFormula> buscarPorId(Long id);

    List<DetalleFormula> listarTodos();

    DetalleFormula actualizar(DetalleFormula detalleFormula);

    void eliminar(Long id);
}