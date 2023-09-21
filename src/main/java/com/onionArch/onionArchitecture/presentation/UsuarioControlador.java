package com.onionArch.onionArchitecture.presentation;

import com.onionArch.onionArchitecture.aplicacion.UsuarioServicio;
import com.onionArch.onionArchitecture.dominio.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio usuarioServ;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioServ.createUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> getAllUsuarios(){
        return usuarioServ.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getUsuarioById(@PathVariable Long id){
        return usuarioServ.getUsuarioById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id){
        usuarioServ.deleteUsuario(id);
    }

}
