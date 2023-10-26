package br.gov.sp.fatec.springboot3labiv.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.springboot3labiv.entity.Termostato;
import br.gov.sp.fatec.springboot3labiv.repository.TermostatoRepository;

@Service
public class TermostatoService implements ITermostatoService{
    
    @Autowired
    private TermostatoRepository termostatoRepo;

    @Transactional
    public Termostato novoTermostato(Termostato termostato) {
        if(termostato == null ||
                termostato.getData() == null || 
                termostato.getTemperatura() == null ||
                termostato.getUmidade() == null || 
                termostato.getParticulas() == null) {
            throw new IllegalArgumentException("Termostato com atributos inválidos!");
        }
        
        return termostato;
    }

    public List<Termostato> buscarTodosTermostatos() {
        return termostatoRepo.findAll();
    }

    public Termostato buscarPorId(Long id) {
        Optional<Termostato> termostatoOp = termostatoRepo.findById(id);
        if(termostatoOp.isEmpty()) {
            throw new IllegalArgumentException("Termostato nao encontrado!");
        }
        return termostatoOp.get();
    }


}
