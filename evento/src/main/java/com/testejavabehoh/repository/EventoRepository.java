package com.testejavabehoh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testejavabehoh.entities.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
}
