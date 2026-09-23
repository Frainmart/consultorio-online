package com.consultorioonline.service;

import com.consultorioonline.entity.FormulaMedica;

import java.util.List;
import java.util.Optional;

public interface FormulaMedicaService {

    FormulaMedica guardar(FormulaMedica formulaMedica);

    Optional<FormulaMedica> buscarPorId(Long id);

    List<FormulaMedica> listarTodos();

    FormulaMedica actualizar(FormulaMedica formulaMedica);

    void eliminar(Long id);
}