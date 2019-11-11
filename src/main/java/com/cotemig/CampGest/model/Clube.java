package com.cotemig.CampGest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clube {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int cod_clube;
	private String nome_clube;
	private String cidade_clube;
	  
	  
	public int getCodigo_clube() {
		return cod_clube;
	}
	public void setCodigo_clube(int codigo_clube) {
		this.cod_clube = codigo_clube;
	}
	public String getNome_clube() {
		return nome_clube;
	}
	public void setNome_clube(String nome_clube) {
		this.nome_clube = nome_clube;
	}
	public String getCidade_clube() {
		return cidade_clube;
	}
	public void setCidade_clube(String cidade_clube) {
		this.cidade_clube = cidade_clube;
	}
	
}
