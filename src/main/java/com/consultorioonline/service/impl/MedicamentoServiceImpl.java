package com.consultorioonline.service.impl;

import com.consultorioonline.entity.Medicamento;
import com.consultorioonline.repository.MedicamentoRepository;
import com.consultorioonline.service.MedicamentoService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    private final MedicamentoRepository medicamentoRepository;

    public MedicamentoServiceImpl(MedicamentoRepository medicamentoRepository) {
        this.medicamentoRepository = medicamentoRepository;
    }

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    @Override
    public Optional<Medicamento> buscarPorId(Long id) {
        return medicamentoRepository.findById(id);
    }

    @Override
    public List<Medicamento> listarTodos() {
        return medicamentoRepository.findAll();
    }

    @Override
    public Medicamento actualizar(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    @Override
    public void eliminar(Long id) {
        medicamentoRepository.deleteById(id);
    }
}