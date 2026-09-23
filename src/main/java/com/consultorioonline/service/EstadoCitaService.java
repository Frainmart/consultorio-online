package com.consultorioonline.service;

import com.consultorioonline.entity.EstadoCita;

import java.util.List;
import java.util.Optional;

public interface EstadoCitaService {

    EstadoCita guardar(EstadoCita estadoCita);

    Optional<EstadoCita> buscarPorId(Long id);

    List<EstadoCita> listarTodos();

    EstadoCita actualizar(EstadoCita estadoCita);

    void eliminar(Long id);
}