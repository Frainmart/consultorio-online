package com.consultorioonline.service.impl;

import com.consultorioonline.entity.Auditoria;
import com.consultorioonline.repository.AuditoriaRepository;
import com.consultorioonline.service.AuditoriaService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuditoriaServiceImpl implements AuditoriaService {

    private final AuditoriaRepository auditoriaRepository;

    public AuditoriaServiceImpl(AuditoriaRepository auditoriaRepository) {
        this.auditoriaRepository = auditoriaRepository;
    }

    @Override
    public Auditoria guardar(Auditoria auditoria) {
        return auditoriaRepository.save(auditoria);
    }

    @Override
    public Optional<Auditoria> buscarPorId(Long id) {
        return auditoriaRepository.findById(id);
    }

    @Override
    public List<Auditoria> listarTodos() {
        return auditoriaRepository.findAll();
    }

    @Override
    public Auditoria actualizar(Auditoria auditoria) {
        return auditoriaRepository.save(auditoria);
    }

    @Override
    public void eliminar(Long id) {
        auditoriaRepository.deleteById(id);
    }
}