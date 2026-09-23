package com.consultorioonline.service;

import com.consultorioonline.entity.Profesional;

import java.util.List;
import java.util.Optional;

public interface ProfesionalService {

    Profesional guardar(Profesional profesional);

    Optional<Profesional> buscarPorId(Long id);

    List<Profesional> listarTodos();

    Profesional actualizar(Profesional profesional);

    void eliminar(Long id);
}