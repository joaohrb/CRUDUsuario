package com.usuario.CRUDUsuario.repository;

import com.usuario.CRUDUsuario.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {


}
