package com.consultorioonline.service.impl;

import com.consultorioonline.entity.Agenda;
import com.consultorioonline.repository.AgendaRepository;
import com.consultorioonline.service.AgendaService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaServiceImpl implements AgendaService {

    private final AgendaRepository agendaRepository;

    public AgendaServiceImpl(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    @Override
    public Agenda guardar(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    @Override
    public Optional<Agenda> buscarPorId(Long id) {
        return agendaRepository.findById(id);
    }

    @Override
    public List<Agenda> listarTodos() {
        return agendaRepository.findAll();
    }

    @Override
    public Agenda actualizar(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    @Override
    public void eliminar(Long id) {
        agendaRepository.deleteById(id);
    }
}