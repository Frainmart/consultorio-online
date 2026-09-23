package com.consultorioonline.service;

import com.consultorioonline.entity.Medicamento;

import java.util.List;
import java.util.Optional;

public interface MedicamentoService {

    Medicamento guardar(Medicamento medicamento);

    Optional<Medicamento> buscarPorId(Long id);

    List<Medicamento> listarTodos();

    Medicamento actualizar(Medicamento medicamento);

    void eliminar(Long id);
}