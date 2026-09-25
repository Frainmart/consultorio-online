package com.consultorioonline.service.impl;

import com.consultorioonline.entity.AtencionDiagnostico;
import com.consultorioonline.repository.AtencionDiagnosticoRepository;
import com.consultorioonline.service.AtencionDiagnosticoService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtencionDiagnosticoServiceImpl implements AtencionDiagnosticoService {

    private final AtencionDiagnosticoRepository atencionDiagnosticoRepository;

    public AtencionDiagnosticoServiceImpl(
            AtencionDiagnosticoRepository atencionDiagnosticoRepository) {
        this.atencionDiagnosticoRepository = atencionDiagnosticoRepository;
    }

    @Override
    public AtencionDiagnostico guardar(AtencionDiagnostico atencionDiagnostico) {
        return atencionDiagnosticoRepository.save(atencionDiagnostico);
    }

    @Override
    public Optional<AtencionDiagnostico> buscarPorId(Long id) {
        return atencionDiagnosticoRepository.findById(id);
    }

    @Override
    public List<AtencionDiagnostico> listarTodos() {
        return atencionDiagnosticoRepository.findAll();
    }

    @Override
    public AtencionDiagnostico actualizar(AtencionDiagnostico atencionDiagnostico) {
        return atencionDiagnosticoRepository.save(atencionDiagnostico);
    }

    @Override
    public void eliminar(Long id) {
        atencionDiagnosticoRepository.deleteById(id);
    }
}