package com.exemplo.api_usuarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @PostMapping("/usuarios")
    public Usuario adicionarUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios(){
        return usuarios;
    }
}
