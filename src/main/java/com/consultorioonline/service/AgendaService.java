package com.consultorioonline.service;

import com.consultorioonline.entity.Agenda;

import java.util.List;
import java.util.Optional;

public interface AgendaService {

    Agenda guardar(Agenda agenda);

    Optional<Agenda> buscarPorId(Long id);

    List<Agenda> listarTodos();

    Agenda actualizar(Agenda agenda);

    void eliminar(Long id);
}