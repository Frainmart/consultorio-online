package com.consultorioonline.service.impl;

import com.consultorioonline.entity.Cita;
import com.consultorioonline.repository.CitaRepository;
import com.consultorioonline.service.CitaService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImpl implements CitaService {

    private final CitaRepository citaRepository;

    public CitaServiceImpl(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @Override
    public Cita guardar(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public Optional<Cita> buscarPorId(Long id) {
        return citaRepository.findById(id);
    }

    @Override
    public List<Cita> listarTodos() {
        return citaRepository.findAll();
    }

    @Override
    public Cita actualizar(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public void eliminar(Long id) {
        citaRepository.deleteById(id);
    }
}