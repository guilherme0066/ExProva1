package br.gov.sp.fatec.springboot3labiv.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trm_termostato")
public class Termostato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trm_id")
    private Long id;

    @Column(name = "trm_data_hora")
    private LocalDateTime data;

    @Column(name = "trm_temperatura")
    private Float temperatura;

    @Column(name = "trm_umidade")
    private Float umidade;

    @Column(name = "trm_particulas")
    private Float particulas;

    public Termostato(LocalDateTime data, Float temperatura, Float umidade, Float particulas) {
        this();
        this.data = data;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.particulas = particulas;
    }

    public Termostato() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Float getUmidade() {
        return umidade;
    }

    public void setUmidade(Float umidade) {
        this.umidade = umidade;
    }

    public Float getParticulas() {
        return particulas;
    }

    public void setParticulas(Float particulas) {
        this.particulas = particulas;
    }

}
