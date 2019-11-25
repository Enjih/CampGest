package com.cotemig.CampGest.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rodada {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cod_tabela;
	
	private List<Partida> partidas;

	public Integer getCod_tabela() {
		return cod_tabela;
	}

	public void setCod_tabela(Integer cod_tabela) {
		this.cod_tabela = cod_tabela;
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
