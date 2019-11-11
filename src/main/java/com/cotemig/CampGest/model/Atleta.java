package com.cotemig.CampGest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atleta {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cod_atleta;
	
	public Integer getCod_atleta() {
		return cod_atleta;
	}
	public void setCod_atleta(Integer cod_atleta) {
		this.cod_atleta = cod_atleta;
	}
	private String nome_atleta;
	private Time time;
	
	public String getNome_atleta() {
		return nome_atleta;
	}
	public void setNome_atleta(String nome_atleta) {
		this.nome_atleta = nome_atleta;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
}
