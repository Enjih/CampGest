package com.cotemig.CampGest.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Rodada {
	private Integer cod_rodada;
	
	@OneToMany(mappedBy="rodada")
	private List<Partida> partidas;
	
	@ManyToOne
	@JoinColumn(name="campeonato_id", nullable=false)
	private Campeonato campeonato_rodada;

	public Integer getCod_rodada() {
		return cod_rodada;
	}

	public void setCod_rodada(Integer cod_rodada) {
		this.cod_rodada = cod_rodada;
	}

	public List<Partida> getPartidas() {
		partidas = new ArrayList<Partida>(10);
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		if(partidas.size() <= 10) {
			this.partidas = partidas;
		}
	}	
}
