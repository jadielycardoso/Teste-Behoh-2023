package com.testejavabehoh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testejavabehoh.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
