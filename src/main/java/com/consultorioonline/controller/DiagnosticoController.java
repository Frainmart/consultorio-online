package com.consultorioonline.controller;

import com.consultorioonline.dto.diagnostico.DiagnosticoRequest;
import com.consultorioonline.dto.diagnostico.DiagnosticoResponse;
import com.consultorioonline.entity.Diagnostico;
import com.consultorioonline.mapper.DiagnosticoMapper;
import com.consultorioonline.service.DiagnosticoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diagnosticos")
public class DiagnosticoController {

    private final DiagnosticoService service;

    public DiagnosticoController(DiagnosticoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<DiagnosticoResponse> crear(@RequestBody DiagnosticoRequest request) {
        Diagnostico entity = DiagnosticoMapper.toEntity(request);
        Diagnostico guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(DiagnosticoMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<DiagnosticoResponse>> listar() {
        List<DiagnosticoResponse> respuesta = service.listarTodos().stream()
                .map(DiagnosticoMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiagnosticoResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(DiagnosticoMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<DiagnosticoResponse> actualizar(@PathVariable Long id, @RequestBody DiagnosticoRequest request) {
        return service.buscarPorId(id).map(actual -> {
            Diagnostico cambios = DiagnosticoMapper.toEntity(request);
            cambios.setIdDiagnostico(actual.getIdDiagnostico());
            actual = cambios;
            Diagnostico actualizado = service.actualizar(actual);
            return ResponseEntity.ok(DiagnosticoMapper.toResponse(actualizado));
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
