package com.testejavabehoh.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testejavabehoh.entities.Evento;
import com.testejavabehoh.entities.Usuario;
import com.testejavabehoh.service.UsuarioService;


	@RestController
	@RequestMapping("/usuarios")
	public class UsuarioController {
	    private final UsuarioService usuarioService;

	    public UsuarioController(UsuarioService usuarioService) {
	        this.usuarioService = usuarioService;
	    }

	    @PostMapping
	    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
	        Usuario novoUsuario = usuarioService.criarUsuario(usuario);
	        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
	    }

	    @GetMapping("/{usuarioId}/inscricoes")
	    public ResponseEntity<List<Evento>> listarInscricoesUsuario(@PathVariable Long usuarioId) {
	        List<Evento> inscricoes = usuarioService.listarInscricoesUsuario(usuarioId);
	        return ResponseEntity.ok(inscricoes);
	    }
}



