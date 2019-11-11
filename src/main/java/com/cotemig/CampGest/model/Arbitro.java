package com.cotemig.CampGest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Arbitro {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cod_arbitro;
	private String nome_arbitro;
	
	
    public Integer getCodigo_arbitro() {
		return cod_arbitro;
	}
	public void setCodigo_arbitro(Integer codigo_arbitro) {
		this.cod_arbitro = codigo_arbitro;
	}
	public String getNome_arbitro() {
		return nome_arbitro;
	}
	public void setNome_arbitro(String nome_arbitro) {
		this.nome_arbitro = nome_arbitro;
	}
	
}
