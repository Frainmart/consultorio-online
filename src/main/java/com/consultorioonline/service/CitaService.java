package com.consultorioonline.service;

import com.consultorioonline.entity.Cita;

import java.util.List;
import java.util.Optional;

public interface CitaService {

    Cita guardar(Cita cita);

    Optional<Cita> buscarPorId(Long id);

    List<Cita> listarTodos();

    Cita actualizar(Cita cita);

    void eliminar(Long id);
}