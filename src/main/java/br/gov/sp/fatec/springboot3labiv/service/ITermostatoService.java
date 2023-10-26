package br.gov.sp.fatec.springboot3labiv.service;

import java.util.List;

import br.gov.sp.fatec.springboot3labiv.entity.Termostato;

public interface ITermostatoService {

    public Termostato novoTermostato(Termostato termostato);

    public List<Termostato> buscarTodosTermostatos();

    public Termostato buscarPorId(Long id);
    
}
