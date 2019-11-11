package com.cotemig.CampGest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estadio {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int cod_estadio;
	
	private String cidade_estadio;
	private String nome_estadio;
	  
	  
	public int getCod_estadio() {
		return cod_estadio;
	}
	public void setCod_estadio(int cod_estadio) {
		this.cod_estadio = cod_estadio;
	}
	public String getCidade_estadio() {
		return cidade_estadio;
	}
	public void setCidade_estadio(String cidade_estadio) {
		this.cidade_estadio = cidade_estadio;
	}
	public String getNome_estadio() {
		return nome_estadio;
	}
	public void setNome_estadio(String nome_estadio) {
		this.nome_estadio = nome_estadio;
	}
	  
}
