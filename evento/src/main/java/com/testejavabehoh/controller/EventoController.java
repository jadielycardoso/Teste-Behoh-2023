package com.testejavabehoh.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testejavabehoh.entities.Evento;
import com.testejavabehoh.entities.Usuario;
import com.testejavabehoh.service.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @PostMapping
    public ResponseEntity<Evento> criarEvento(@RequestBody Evento evento) {
        Evento novoEvento = eventoService.criarEvento(evento);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoEvento);
    }

    @PostMapping("/{eventoId}/inscricao/{usuarioId}")
    public ResponseEntity<Void> inscreverUsuario(@PathVariable Long eventoId, @PathVariable Long usuarioId) {
        eventoService.inscreverUsuario(eventoId, usuarioId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{eventoId}/inscricao/{usuarioId}")
    public ResponseEntity<Void> cancelarInscricao(@PathVariable Long eventoId, @PathVariable Long usuarioId) {
        eventoService.cancelarInscricao(eventoId, usuarioId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{eventoId}/inscritos")
    public ResponseEntity<List<Usuario>> listarInscritosEvento(@PathVariable Long eventoId) {
        List<Usuario> inscritos = eventoService.listarInscritosEvento(eventoId);
        return ResponseEntity.ok(inscritos);
    }

    @PostMapping("/{eventoId}/entrada/{usuarioId}")
    public ResponseEntity<Void> realizarEntradaEvento(@PathVariable Long eventoId, @PathVariable Long usuarioId) {
        eventoService.realizarEntradaEvento(eventoId, usuarioId);
        return ResponseEntity.ok().build();
    }
}

	
	



