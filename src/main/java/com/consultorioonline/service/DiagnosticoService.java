package com.consultorioonline.service;

import com.consultorioonline.entity.Diagnostico;

import java.util.List;
import java.util.Optional;

public interface DiagnosticoService {

    Diagnostico guardar(Diagnostico diagnostico);

    Optional<Diagnostico> buscarPorId(Long id);

    List<Diagnostico> listarTodos();

    Diagnostico actualizar(Diagnostico diagnostico);

    void eliminar(Long id);
}