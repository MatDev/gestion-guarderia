package com.guarderia.gestion_guarderia.repository;

import com.guarderia.gestion_guarderia.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

 Optional<Usuario> findByRut(String rut);
}