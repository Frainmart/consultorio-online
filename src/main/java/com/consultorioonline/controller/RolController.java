package com.consultorioonline.controller;

import com.consultorioonline.dto.rol.RolRequest;
import com.consultorioonline.dto.rol.RolResponse;
import com.consultorioonline.entity.Rol;
import com.consultorioonline.mapper.RolMapper;
import com.consultorioonline.service.RolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    private final RolService service;

    public RolController(RolService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RolResponse> crear(@RequestBody RolRequest request) {
        Rol entity = RolMapper.toEntity(request);
        Rol guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(RolMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<RolResponse>> listar() {
        List<RolResponse> respuesta = service.listarTodos().stream()
                .map(RolMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RolResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(RolMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<RolResponse> actualizar(@PathVariable Long id, @RequestBody RolRequest request) {
        return service.buscarPorId(id).map(actual -> {
            Rol cambios = RolMapper.toEntity(request);
            cambios.setIdRol(actual.getIdRol());
            actual = cambios;
            Rol actualizado = service.actualizar(actual);
            return ResponseEntity.ok(RolMapper.toResponse(actualizado));
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
