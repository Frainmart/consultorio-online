package com.consultorioonline.service.impl;

import com.consultorioonline.entity.Diagnostico;
import com.consultorioonline.repository.DiagnosticoRepository;
import com.consultorioonline.service.DiagnosticoService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiagnosticoServiceImpl implements DiagnosticoService {

    private final DiagnosticoRepository diagnosticoRepository;

    public DiagnosticoServiceImpl(DiagnosticoRepository diagnosticoRepository) {
        this.diagnosticoRepository = diagnosticoRepository;
    }

    @Override
    public Diagnostico guardar(Diagnostico diagnostico) {
        return diagnosticoRepository.save(diagnostico);
    }

    @Override
    public Optional<Diagnostico> buscarPorId(Long id) {
        return diagnosticoRepository.findById(id);
    }

    @Override
    public List<Diagnostico> listarTodos() {
        return diagnosticoRepository.findAll();
    }

    @Override
    public Diagnostico actualizar(Diagnostico diagnostico) {
        return diagnosticoRepository.save(diagnostico);
    }

    @Override
    public void eliminar(Long id) {
        diagnosticoRepository.deleteById(id);
    }
}
