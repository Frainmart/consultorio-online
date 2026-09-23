package com.consultorioonline.service;

import com.consultorioonline.entity.Especialidad;

import java.util.List;
import java.util.Optional;

public interface EspecialidadService {

    Especialidad guardar(Especialidad especialidad);

    Optional<Especialidad> buscarPorId(Long id);

    List<Especialidad> listarTodos();

    Especialidad actualizar(Especialidad especialidad);

    void eliminar(Long id);
}