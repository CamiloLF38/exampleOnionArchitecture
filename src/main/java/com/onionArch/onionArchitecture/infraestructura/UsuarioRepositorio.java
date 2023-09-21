package com.onionArch.onionArchitecture.infraestructura;

import com.onionArch.onionArchitecture.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
