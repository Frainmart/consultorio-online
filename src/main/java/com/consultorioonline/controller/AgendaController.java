package com.consultorioonline.controller;

import com.consultorioonline.dto.agenda.AgendaRequest;
import com.consultorioonline.dto.agenda.AgendaResponse;
import com.consultorioonline.entity.Agenda;
import com.consultorioonline.mapper.AgendaMapper;
import com.consultorioonline.service.AgendaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agendas")
public class AgendaController {

    private final AgendaService service;

    public AgendaController(AgendaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AgendaResponse> crear(@RequestBody AgendaRequest request) {
        Agenda entity = AgendaMapper.toEntity(request);
        Agenda guardado = service.guardar(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(AgendaMapper.toResponse(guardado));
    }

    @GetMapping
    public ResponseEntity<List<AgendaResponse>> listar() {
        List<AgendaResponse> respuesta = service.listarTodos().stream()
                .map(AgendaMapper::toResponse)
                .toList();
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendaResponse> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(AgendaMapper::toResponse)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<AgendaResponse> actualizar(@PathVariable Long id, @RequestBody AgendaRequest request) {
        return service.buscarPorId(id).map(actual -> {
            Agenda cambios = AgendaMapper.toEntity(request);
            cambios.setIdAgenda(actual.getIdAgenda());
            actual = cambios;
            Agenda actualizado = service.actualizar(actual);
            return ResponseEntity.ok(AgendaMapper.toResponse(actualizado));
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
