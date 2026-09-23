package com.consultorioonline.service;

import com.consultorioonline.entity.AtencionMedica;

import java.util.List;
import java.util.Optional;

public interface AtencionMedicaService {

    AtencionMedica guardar(AtencionMedica atencionMedica);

    Optional<AtencionMedica> buscarPorId(Long id);

    List<AtencionMedica> listarTodos();

    AtencionMedica actualizar(AtencionMedica atencionMedica);

    void eliminar(Long id);
}
