package com.usuario.CRUDUsuario.controller;
//teste
import com.usuario.CRUDUsuario.model.Usuario;
import com.usuario.CRUDUsuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ControlerUsuario {
    @Autowired
    public UsuarioRepository usuarioRepository;


    @GetMapping("/usuario")
    public Iterable<Usuario> consulta(){
     return usuarioRepository.findAll();
    }

    @PostMapping("/cadastro")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/usuario/{id}")
    public String atualizarUsuario(@RequestBody Usuario usuario, @PathVariable Long id) {

        usuarioRepository.save(usuario);
        return "Usuario Atualizado com id:"+ id;
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
        return "Usuario deletado com sucesso";
    }

}
