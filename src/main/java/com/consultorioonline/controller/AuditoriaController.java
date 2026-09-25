package com.consultorioonline.controller;

import com.consultorioonline.dto.auditoria.AuditoriaRequest;
import com.consultorioonline.dto.auditoria.AuditoriaResponse;
import com.consultorioonline.entity.Auditoria;
import com.consultorioonline.mapper.AuditoriaMapper;
import com.consultorioonline.service.AuditoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auditorias")
public class AuditoriaController {

    private final AuditoriaService service;

    public AuditoriaController(AuditoriaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AuditoriaResponse> crear(@RequestBody AuditoriaRequest request) {
        Auditoria entity = AuditoriaMapper.toEntity(request);
        Auditoria guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(AuditoriaMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<AuditoriaResponse>> listar() {
        List<AuditoriaResponse> respuesta = service.listarTodos().stream()
                .map(AuditoriaMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuditoriaResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(AuditoriaMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<AuditoriaResponse> actualizar(@PathVariable Long id, @RequestBody AuditoriaRequest request) {
        return service.buscarPorId(id).map(actual -> {
            Auditoria cambios = AuditoriaMapper.toEntity(request);
            cambios.setIdAuditoria(actual.getIdAuditoria());
            actual = cambios;
            Auditoria actualizado = service.actualizar(actual);
            return ResponseEntity.ok(AuditoriaMapper.toResponse(actualizado));
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
