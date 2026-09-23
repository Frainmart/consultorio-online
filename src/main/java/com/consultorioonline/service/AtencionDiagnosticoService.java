package com.consultorioonline.service;

import com.consultorioonline.entity.AtencionDiagnostico;

import java.util.List;
import java.util.Optional;

public interface AtencionDiagnosticoService {

    AtencionDiagnostico guardar(AtencionDiagnostico atencionDiagnostico);

    Optional<AtencionDiagnostico> buscarPorId(Long id);

    List<AtencionDiagnostico> listarTodos();

    AtencionDiagnostico actualizar(AtencionDiagnostico atencionDiagnostico);

    void eliminar(Long id);
}