package com.consultorioonline.service.impl;

import com.consultorioonline.entity.EstadoCita;
import com.consultorioonline.repository.EstadoCitaRepository;
import com.consultorioonline.service.EstadoCitaService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoCitaServiceImpl implements EstadoCitaService {

    private final EstadoCitaRepository estadoCitaRepository;

    public EstadoCitaServiceImpl(EstadoCitaRepository estadoCitaRepository) {
        this.estadoCitaRepository = estadoCitaRepository;
    }

    @Override
    public EstadoCita guardar(EstadoCita estadoCita) {
        return estadoCitaRepository.save(estadoCita);
    }

    @Override
    public Optional<EstadoCita> buscarPorId(Long id) {
        return estadoCitaRepository.findById(id);
    }

    @Override
    public List<EstadoCita> listarTodos() {
        return estadoCitaRepository.findAll();
    }

    @Override
    public EstadoCita actualizar(EstadoCita estadoCita) {
        return estadoCitaRepository.save(estadoCita);
    }

    @Override
    public void eliminar(Long id) {
        estadoCitaRepository.deleteById(id);
    }
}