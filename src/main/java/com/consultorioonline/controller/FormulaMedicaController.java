package com.consultorioonline.controller;

import com.consultorioonline.dto.formula.FormulaMedicaRequest;
import com.consultorioonline.dto.formula.FormulaMedicaResponse;
import com.consultorioonline.entity.FormulaMedica;
import com.consultorioonline.mapper.FormulaMedicaMapper;
import com.consultorioonline.service.FormulaMedicaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formulas-medicas")
public class FormulaMedicaController {

    private final FormulaMedicaService service;

    public FormulaMedicaController(FormulaMedicaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<FormulaMedicaResponse> crear(@RequestBody FormulaMedicaRequest request) {
        FormulaMedica entity = FormulaMedicaMapper.toEntity(request);
        FormulaMedica guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(FormulaMedicaMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<FormulaMedicaResponse>> listar() {
        List<FormulaMedicaResponse> respuesta = service.listarTodos().stream()
                .map(FormulaMedicaMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormulaMedicaResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(FormulaMedicaMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FormulaMedicaResponse> actualizar(@PathVariable Long id, @RequestBody FormulaMedicaRequest request) {
        return service.buscarPorId(id).map(actual -> {
            FormulaMedica cambios = FormulaMedicaMapper.toEntity(request);
            cambios.setIdFormula(actual.getIdFormula());
            actual = cambios;
            FormulaMedica actualizado = service.actualizar(actual);
            return ResponseEntity.ok(FormulaMedicaMapper.toResponse(actualizado));
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
