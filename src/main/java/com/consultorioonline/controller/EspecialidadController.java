package com.consultorioonline.controller;

import com.consultorioonline.dto.especialidad.EspecialidadRequest;
import com.consultorioonline.dto.especialidad.EspecialidadResponse;
import com.consultorioonline.entity.Especialidad;
import com.consultorioonline.mapper.EspecialidadMapper;
import com.consultorioonline.service.EspecialidadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadController {

    private final EspecialidadService service;

    public EspecialidadController(EspecialidadService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<EspecialidadResponse> crear(@RequestBody EspecialidadRequest request) {
        Especialidad entity = EspecialidadMapper.toEntity(request);
        Especialidad guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(EspecialidadMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<EspecialidadResponse>> listar() {
        List<EspecialidadResponse> respuesta = service.listarTodos().stream()
                .map(EspecialidadMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EspecialidadResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(EspecialidadMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EspecialidadResponse> actualizar(@PathVariable Long id, @RequestBody EspecialidadRequest request) {
        return service.buscarPorId(id).map(actual -> {
            Especialidad cambios = EspecialidadMapper.toEntity(request);
            cambios.setIdEspecialidad(actual.getIdEspecialidad());
            actual = cambios;
            Especialidad actualizado = service.actualizar(actual);
            return ResponseEntity.ok(EspecialidadMapper.toResponse(actualizado));
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
