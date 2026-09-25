package com.consultorioonline.service.impl;

import com.consultorioonline.entity.DetalleFormula;
import com.consultorioonline.repository.DetalleFormulaRepository;
import com.consultorioonline.service.DetalleFormulaService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleFormulaServiceImpl implements DetalleFormulaService {

    private final DetalleFormulaRepository detalleFormulaRepository;

    public DetalleFormulaServiceImpl(
            DetalleFormulaRepository detalleFormulaRepository) {
        this.detalleFormulaRepository = detalleFormulaRepository;
    }

    @Override
    public DetalleFormula guardar(DetalleFormula detalleFormula) {
        return detalleFormulaRepository.save(detalleFormula);
    }

    @Override
    public Optional<DetalleFormula> buscarPorId(Long id) {
        return detalleFormulaRepository.findById(id);
    }

    @Override
    public List<DetalleFormula> listarTodos() {
        return detalleFormulaRepository.findAll();
    }

    @Override
    public DetalleFormula actualizar(DetalleFormula detalleFormula) {
        return detalleFormulaRepository.save(detalleFormula);
    }

    @Override
    public void eliminar(Long id) {
        detalleFormulaRepository.deleteById(id);
    }
}