package com.consultorioonline.controller;

import com.consultorioonline.dto.paciente.PacienteRequest;
import com.consultorioonline.dto.paciente.PacienteUpdateRequest;
import com.consultorioonline.dto.paciente.PacienteResponse;
import com.consultorioonline.entity.Paciente;
import com.consultorioonline.mapper.PacienteMapper;
import com.consultorioonline.service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PacienteResponse> crear(@RequestBody PacienteRequest request) {
        Paciente entity = PacienteMapper.toEntity(request);
        Paciente guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(PacienteMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<PacienteResponse>> listar() {
        List<PacienteResponse> respuesta = service.listarTodos().stream()
                .map(PacienteMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(PacienteMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PacienteResponse> actualizar(@PathVariable Long id, @RequestBody PacienteUpdateRequest request) {
        return service.buscarPorId(id).map(actual -> {
            PacienteMapper.updateEntity(request, actual);
            Paciente actualizado = service.actualizar(actual);
            return ResponseEntity.ok(PacienteMapper.toResponse(actualizado));
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
