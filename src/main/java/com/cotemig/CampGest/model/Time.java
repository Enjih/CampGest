package com.cotemig.CampGest.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Time {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cod_time;
	
	private String nome_time;
	
	//@OneToMany(mappedBy="time")
    //private Set<Atleta> atletas;
	
	public String getNome_time() {
		return nome_time;
	}
	public void setNome_time(String nome_time) {
		this.nome_time = nome_time;
	}		
}
