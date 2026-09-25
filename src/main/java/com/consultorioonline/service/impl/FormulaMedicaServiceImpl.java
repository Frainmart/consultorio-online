package com.consultorioonline.service.impl;

import com.consultorioonline.entity.FormulaMedica;
import com.consultorioonline.repository.FormulaMedicaRepository;
import com.consultorioonline.service.FormulaMedicaService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormulaMedicaServiceImpl implements FormulaMedicaService {

    private final FormulaMedicaRepository formulaMedicaRepository;

    public FormulaMedicaServiceImpl(FormulaMedicaRepository formulaMedicaRepository) {
        this.formulaMedicaRepository = formulaMedicaRepository;
    }

    @Override
    public FormulaMedica guardar(FormulaMedica formulaMedica) {
        return formulaMedicaRepository.save(formulaMedica);
    }

    @Override
    public Optional<FormulaMedica> buscarPorId(Long id) {
        return formulaMedicaRepository.findById(id);
    }

    @Override
    public List<FormulaMedica> listarTodos() {
        return formulaMedicaRepository.findAll();
    }

    @Override
    public FormulaMedica actualizar(FormulaMedica formulaMedica) {
        return formulaMedicaRepository.save(formulaMedica);
    }

    @Override
    public void eliminar(Long id) {
        formulaMedicaRepository.deleteById(id);
    }
}