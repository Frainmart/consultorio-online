package com.consultorioonline.service.impl;

import com.consultorioonline.entity.Profesional;
import com.consultorioonline.repository.ProfesionalRepository;
import com.consultorioonline.service.ProfesionalService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesionalServiceImpl implements ProfesionalService {

    private final ProfesionalRepository profesionalRepository;

    public ProfesionalServiceImpl(ProfesionalRepository profesionalRepository) {
        this.profesionalRepository = profesionalRepository;
    }

    @Override
    public Profesional guardar(Profesional profesional) {
        return profesionalRepository.save(profesional);
    }

    @Override
    public Optional<Profesional> buscarPorId(Long id) {
        return profesionalRepository.findById(id);
    }

    @Override
    public List<Profesional> listarTodos() {
        return profesionalRepository.findAll();
    }

    @Override
    public Profesional actualizar(Profesional profesional) {
        return profesionalRepository.save(profesional);
    }

    @Override
    public void eliminar(Long id) {
        profesionalRepository.deleteById(id);
    }
}