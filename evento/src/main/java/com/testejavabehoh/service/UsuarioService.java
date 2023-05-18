package com.testejavabehoh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.testejavabehoh.entities.Evento;
import com.testejavabehoh.entities.Usuario;
import com.testejavabehoh.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
private UsuarioRepository usuarioRepository;
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.get();
	}

	public Usuario criarUsuario(Usuario usuario) {
		return null;
	}

	public List<Evento> listarInscricoesUsuario(Long usuarioId) {
		return null;
	}	

}
