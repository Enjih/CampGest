package com.cotemig.CampGest.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Time {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cod_time;
	
	private String nome_time;
	
	@OneToMany(mappedBy="time")
    private List<Atleta> atletas;
	
	private Integer pontos;
	private Integer vitorias;
	private Integer derrotas;
	private Integer empates;	
	private Integer gols_pro;
	private Integer gols_contra;
	
	@ManyToMany(mappedBy="times")
	private List<Partida> partidas;
	
	@ManyToOne
	@JoinColumn(name="campeonato_id", nullable=false)
	private Campeonato campeonato;
	
	public Integer SaldoGols(){
		return gols_pro - gols_contra;
	}
	
	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Integer getVitorias() {
		return vitorias;
	}

	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}

	public Integer getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}

	public Integer getEmpates() {
		return empates;
	}

	public void setEmpates(Integer empates) {
		this.empates = empates;
	}

	public Integer getGols_pro() {
		return gols_pro;
	}

	public void setGols_pro(Integer gols_pro) {
		this.gols_pro = gols_pro;
	}

	public Integer getGols_contra() {
		return gols_contra;
	}

	public void setGols_contra(Integer gols_contra) {
		this.gols_contra = gols_contra;
	}

	public Integer getCod_time() {
		return cod_time;
	}
	public void setCod_time(Integer cod_time) {
		this.cod_time = cod_time;
	}
	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}	
	public String getNome_time() {
		return nome_time;
	}
	public void setNome_time(String nome_time) {
		this.nome_time = nome_time;
	}		
}
