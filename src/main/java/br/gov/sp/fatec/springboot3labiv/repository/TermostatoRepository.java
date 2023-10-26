package br.gov.sp.fatec.springboot3labiv.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.springboot3labiv.entity.Termostato;

public interface TermostatoRepository extends JpaRepository<Termostato, Long>{

    public Optional<Termostato> findByData(LocalDateTime data);

    @Query("select u from Termostato u where u.data = ?1")
    public Optional<Termostato> buscarPelaData(LocalDateTime data);
    
}
