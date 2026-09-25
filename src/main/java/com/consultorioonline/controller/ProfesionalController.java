package com.consultorioonline.controller;

import com.consultorioonline.dto.profesional.ProfesionalRequest;
import com.consultorioonline.dto.profesional.ProfesionalUpdateRequest;
import com.consultorioonline.dto.profesional.ProfesionalResponse;
import com.consultorioonline.entity.Profesional;
import com.consultorioonline.mapper.ProfesionalMapper;
import com.consultorioonline.service.ProfesionalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesionales")
public class ProfesionalController {

    private final ProfesionalService service;

    public ProfesionalController(ProfesionalService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ProfesionalResponse> crear(@RequestBody ProfesionalRequest request) {
        Profesional entity = ProfesionalMapper.toEntity(request);
        Profesional guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(ProfesionalMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<ProfesionalResponse>> listar() {
        List<ProfesionalResponse> respuesta = service.listarTodos().stream()
                .map(ProfesionalMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfesionalResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ProfesionalMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProfesionalResponse> actualizar(@PathVariable Long id, @RequestBody ProfesionalUpdateRequest request) {
        return service.buscarPorId(id).map(actual -> {
            ProfesionalMapper.updateEntity(request, actual);
            Profesional actualizado = service.actualizar(actual);
            return ResponseEntity.ok(ProfesionalMapper.toResponse(actualizado));
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
