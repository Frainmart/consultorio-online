package com.consultorioonline.service.impl;

import com.consultorioonline.entity.Especialidad;
import com.consultorioonline.repository.EspecialidadRepository;
import com.consultorioonline.service.EspecialidadService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

    private final EspecialidadRepository especialidadRepository;

    public EspecialidadServiceImpl(EspecialidadRepository especialidadRepository) {
        this.especialidadRepository = especialidadRepository;
    }

    @Override
    public Especialidad guardar(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @Override
    public Optional<Especialidad> buscarPorId(Long id) {
        return especialidadRepository.findById(id);
    }

    @Override
    public List<Especialidad> listarTodos() {
        return especialidadRepository.findAll();
    }

    @Override
    public Especialidad actualizar(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @Override
    public void eliminar(Long id) {
        especialidadRepository.deleteById(id);
    }
}