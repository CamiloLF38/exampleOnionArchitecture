package com.onionArch.onionArchitecture.aplicacion;

import com.onionArch.onionArchitecture.dominio.Usuario;
import com.onionArch.onionArchitecture.infraestructura.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public Usuario createUsuario(Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }

    public Optional<Usuario> getUsuarioById(Long id){
        return usuarioRepositorio.findById(id);
    }

    public List<Usuario> getAllUsuarios(){
        return usuarioRepositorio.findAll();
    }

    public void deleteUsuario(Long id){
        usuarioRepositorio.deleteById(id);
    }
}
