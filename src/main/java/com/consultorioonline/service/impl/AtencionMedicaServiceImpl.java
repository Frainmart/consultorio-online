package com.consultorioonline.service.impl;

import com.consultorioonline.entity.AtencionMedica;
import com.consultorioonline.repository.AtencionMedicaRepository;
import com.consultorioonline.service.AtencionMedicaService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtencionMedicaServiceImpl implements AtencionMedicaService {

    private final AtencionMedicaRepository atencionMedicaRepository;

    public AtencionMedicaServiceImpl(
            AtencionMedicaRepository atencionMedicaRepository) {
        this.atencionMedicaRepository = atencionMedicaRepository;
    }

    @Override
    public AtencionMedica guardar(AtencionMedica atencionMedica) {
        return atencionMedicaRepository.save(atencionMedica);
    }

    @Override
    public Optional<AtencionMedica> buscarPorId(Long id) {
        return atencionMedicaRepository.findById(id);
    }

    @Override
    public List<AtencionMedica> listarTodos() {
        return atencionMedicaRepository.findAll();
    }

    @Override
    public AtencionMedica actualizar(AtencionMedica atencionMedica) {
        return atencionMedicaRepository.save(atencionMedica);
    }

    @Override
    public void eliminar(Long id) {
        atencionMedicaRepository.deleteById(id);
    }
}