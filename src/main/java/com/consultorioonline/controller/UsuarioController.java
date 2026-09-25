package com.consultorioonline.controller;

import com.consultorioonline.dto.usuario.UsuarioRequest;
import com.consultorioonline.dto.usuario.UsuarioUpdateRequest;
import com.consultorioonline.dto.usuario.UsuarioResponse;
import com.consultorioonline.entity.Usuario;
import com.consultorioonline.mapper.UsuarioMapper;
import com.consultorioonline.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> crear(@RequestBody UsuarioRequest request) {
        Usuario entity = UsuarioMapper.toEntity(request);
        Usuario guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> listar() {
        List<UsuarioResponse> respuesta = service.listarTodos().stream()
                .map(UsuarioMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(UsuarioMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponse> actualizar(@PathVariable Long id, @RequestBody UsuarioUpdateRequest request) {
        return service.buscarPorId(id).map(actual -> {
            UsuarioMapper.updateEntity(request, actual);
            Usuario actualizado = service.actualizar(actual);
            return ResponseEntity.ok(UsuarioMapper.toResponse(actualizado));
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
