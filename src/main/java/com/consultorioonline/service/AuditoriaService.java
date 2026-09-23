package com.consultorioonline.service;

import com.consultorioonline.entity.Auditoria;

import java.util.List;
import java.util.Optional;

public interface AuditoriaService {

    Auditoria guardar(Auditoria auditoria);

    Optional<Auditoria> buscarPorId(Long id);

    List<Auditoria> listarTodos();

    Auditoria actualizar(Auditoria auditoria);

    void eliminar(Long id);
}