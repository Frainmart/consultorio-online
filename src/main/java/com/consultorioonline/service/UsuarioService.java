package com.consultorioonline.service;

import com.consultorioonline.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Usuario guardar(Usuario usuario);

    Optional<Usuario> buscarPorId(Long id);

    List<Usuario> listarTodos();

    Usuario actualizar(Usuario usuario);

    void eliminar(Long id);
}