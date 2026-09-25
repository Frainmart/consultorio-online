package com.consultorioonline.controller;

import com.consultorioonline.dto.atencion.AtencionMedicaRequest;
import com.consultorioonline.dto.atencion.AtencionMedicaResponse;
import com.consultorioonline.entity.AtencionMedica;
import com.consultorioonline.mapper.AtencionMedicaMapper;
import com.consultorioonline.service.AtencionMedicaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/atenciones-medicas")
public class AtencionMedicaController {

    private final AtencionMedicaService service;

    public AtencionMedicaController(AtencionMedicaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AtencionMedicaResponse> crear(@RequestBody AtencionMedicaRequest request) {
        AtencionMedica entity = AtencionMedicaMapper.toEntity(request);
        AtencionMedica guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(AtencionMedicaMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<AtencionMedicaResponse>> listar() {
        List<AtencionMedicaResponse> respuesta = service.listarTodos().stream()
                .map(AtencionMedicaMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AtencionMedicaResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(AtencionMedicaMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<AtencionMedicaResponse> actualizar(@PathVariable Long id, @RequestBody AtencionMedicaRequest request) {
        return service.buscarPorId(id).map(actual -> {
            AtencionMedica cambios = AtencionMedicaMapper.toEntity(request);
            cambios.setIdAtencion(actual.getIdAtencion());
            actual = cambios;
            AtencionMedica actualizado = service.actualizar(actual);
            return ResponseEntity.ok(AtencionMedicaMapper.toResponse(actualizado));
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
