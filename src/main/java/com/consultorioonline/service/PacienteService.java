package com.consultorioonline.service;

import com.consultorioonline.entity.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteService {

    Paciente guardar(Paciente paciente);

    Optional<Paciente> buscarPorId(Long id);

    List<Paciente> listarTodos();

    Paciente actualizar(Paciente paciente);

    void eliminar(Long id);
}