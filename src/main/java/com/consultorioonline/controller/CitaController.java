package com.consultorioonline.controller;

import com.consultorioonline.dto.cita.CitaRequest;
import com.consultorioonline.dto.cita.CitaResponse;
import com.consultorioonline.entity.Cita;
import com.consultorioonline.mapper.CitaMapper;
import com.consultorioonline.service.CitaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    private final CitaService service;

    public CitaController(CitaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CitaResponse> crear(@RequestBody CitaRequest request) {
        Cita entity = CitaMapper.toEntity(request);
        Cita guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(CitaMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<CitaResponse>> listar() {
        List<CitaResponse> respuesta = service.listarTodos().stream()
                .map(CitaMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CitaResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(CitaMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CitaResponse> actualizar(@PathVariable Long id, @RequestBody CitaRequest request) {
        return service.buscarPorId(id).map(actual -> {
            Cita cambios = CitaMapper.toEntity(request);
            cambios.setIdCita(actual.getIdCita());
            actual = cambios;
            Cita actualizado = service.actualizar(actual);
            return ResponseEntity.ok(CitaMapper.toResponse(actualizado));
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
