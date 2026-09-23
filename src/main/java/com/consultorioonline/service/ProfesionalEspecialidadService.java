package com.consultorioonline.service;

import com.consultorioonline.entity.ProfesionalEspecialidad;

import java.util.List;
import java.util.Optional;

public interface ProfesionalEspecialidadService {

    ProfesionalEspecialidad guardar(ProfesionalEspecialidad profesionalEspecialidad);

    Optional<ProfesionalEspecialidad> buscarPorId(Long id);

    List<ProfesionalEspecialidad> listarTodos();

    ProfesionalEspecialidad actualizar(ProfesionalEspecialidad profesionalEspecialidad);

    void eliminar(Long id);
}