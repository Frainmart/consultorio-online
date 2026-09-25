package com.consultorioonline.service.impl;

import com.consultorioonline.entity.ProfesionalEspecialidad;
import com.consultorioonline.repository.ProfesionalEspecialidadRepository;
import com.consultorioonline.service.ProfesionalEspecialidadService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesionalEspecialidadServiceImpl implements ProfesionalEspecialidadService {

    private final ProfesionalEspecialidadRepository profesionalEspecialidadRepository;

    public ProfesionalEspecialidadServiceImpl(
            ProfesionalEspecialidadRepository profesionalEspecialidadRepository) {
        this.profesionalEspecialidadRepository = profesionalEspecialidadRepository;
    }

    @Override
    public ProfesionalEspecialidad guardar(ProfesionalEspecialidad profesionalEspecialidad) {
        return profesionalEspecialidadRepository.save(profesionalEspecialidad);
    }

    @Override
    public Optional<ProfesionalEspecialidad> buscarPorId(Long id) {
        return profesionalEspecialidadRepository.findById(id);
    }

    @Override
    public List<ProfesionalEspecialidad> listarTodos() {
        return profesionalEspecialidadRepository.findAll();
    }

    @Override
    public ProfesionalEspecialidad actualizar(ProfesionalEspecialidad profesionalEspecialidad) {
        return profesionalEspecialidadRepository.save(profesionalEspecialidad);
    }

    @Override
    public void eliminar(Long id) {
        profesionalEspecialidadRepository.deleteById(id);
    }
}