package com.cotemig.CampGest.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Time {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cod_time;
	
	private String nome_time;
	private List<Atleta> atletas;
	
	public String getNome_time() {
		return nome_time;
	}
	public void setNome_time(String nome_time) {
		this.nome_time = nome_time;
	}
	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}	
	
	
	
	
}
