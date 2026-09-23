package com.consultorioonline.service;

import com.consultorioonline.entity.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService {

    Rol guardar(Rol rol);

    Optional<Rol> buscarPorId(Long id);

    List<Rol> listarTodos();

    Rol actualizar(Rol rol);

    void eliminar(Long id);
}