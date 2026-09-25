package com.consultorioonline.controller;

import com.consultorioonline.dto.medicamento.MedicamentoRequest;
import com.consultorioonline.dto.medicamento.MedicamentoResponse;
import com.consultorioonline.entity.Medicamento;
import com.consultorioonline.mapper.MedicamentoMapper;
import com.consultorioonline.service.MedicamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicamentos")
public class MedicamentoController {

    private final MedicamentoService service;

    public MedicamentoController(MedicamentoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<MedicamentoResponse> crear(@RequestBody MedicamentoRequest request) {
        Medicamento entity = MedicamentoMapper.toEntity(request);
        Medicamento guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(MedicamentoMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<MedicamentoResponse>> listar() {
        List<MedicamentoResponse> respuesta = service.listarTodos().stream()
                .map(MedicamentoMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicamentoResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(MedicamentoMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicamentoResponse> actualizar(@PathVariable Long id, @RequestBody MedicamentoRequest request) {
        return service.buscarPorId(id).map(actual -> {
            Medicamento cambios = MedicamentoMapper.toEntity(request);
            cambios.setIdMedicamento(actual.getIdMedicamento());
            actual = cambios;
            Medicamento actualizado = service.actualizar(actual);
            return ResponseEntity.ok(MedicamentoMapper.toResponse(actualizado));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (service.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
