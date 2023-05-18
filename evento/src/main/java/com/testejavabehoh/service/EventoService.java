package com.testejavabehoh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.testejavabehoh.entities.Evento;
import com.testejavabehoh.entities.Usuario;
import com.testejavabehoh.repository.EventoRepository;

@Service
public class EventoService {
	
	private EventoRepository eventoRepository;
	
	public List<Evento> findAll() {
		return eventoRepository.findAll();
	}
	
	public Evento findById(Long id) {
		Optional<Evento> obj = eventoRepository.findById(id);
		return obj.get();
	}

	public Evento criarEvento(Evento evento) {
		return null;
	}

	public void inscreverUsuario(Long eventoId, Long usuarioId) {
	
	}

	public void cancelarInscricao(Long eventoId, Long usuarioId) {
		
	}

	public List<Usuario> listarInscritosEvento(Long eventoId) {
		return null;
	}

	public void realizarEntradaEvento(Long eventoId, Long usuarioId) {		
	}	
}
	

	


