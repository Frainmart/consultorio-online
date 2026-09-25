package com.consultorioonline.controller;

import com.consultorioonline.dto.estado.EstadoCitaRequest;
import com.consultorioonline.dto.estado.EstadoCitaResponse;
import com.consultorioonline.entity.EstadoCita;
import com.consultorioonline.mapper.EstadoCitaMapper;
import com.consultorioonline.service.EstadoCitaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estados-cita")
public class EstadoCitaController {

    private final EstadoCitaService service;

    public EstadoCitaController(EstadoCitaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<EstadoCitaResponse> crear(@RequestBody EstadoCitaRequest request) {
        EstadoCita entity = EstadoCitaMapper.toEntity(request);
        EstadoCita guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoCitaMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<EstadoCitaResponse>> listar() {
        List<EstadoCitaResponse> respuesta = service.listarTodos().stream()
                .map(EstadoCitaMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoCitaResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(EstadoCitaMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstadoCitaResponse> actualizar(@PathVariable Long id, @RequestBody EstadoCitaRequest request) {
        return service.buscarPorId(id).map(actual -> {
            EstadoCita cambios = EstadoCitaMapper.toEntity(request);
            cambios.setIdEstadoCita(actual.getIdEstadoCita());
            actual = cambios;
            EstadoCita actualizado = service.actualizar(actual);
            return ResponseEntity.ok(EstadoCitaMapper.toResponse(actualizado));
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
