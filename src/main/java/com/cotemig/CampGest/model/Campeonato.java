package com.cotemig.CampGest.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Campeonato {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int cod_campeonato;
	
    private String nome_campeonato;
    private String dtaInicio_campeonato;
    private String dtaFinal_campeonato;
    private List<Rodada> rodadas; 
    private List<Time> times;
    
	public int getCod_campeonato() {
		return cod_campeonato;
	}
	public void setCod_campeonato(int cod_campeonato) {
		this.cod_campeonato = cod_campeonato;
	}
	public String getNome_campeonato() {
		return nome_campeonato;
	}
	public void setNome_campeonato(String nome_campeonato) {
		this.nome_campeonato = nome_campeonato;
	}
	public String getDtaInicio_campeonato() {
		return dtaInicio_campeonato;
	}
	public void setDtaInicio_campeonato(String dtaInicio_campeonato) {
		this.dtaInicio_campeonato = dtaInicio_campeonato;
	}
	public String getDtaFinal_campeonato() {
		return dtaFinal_campeonato;
	}
	public void setDtaFinal_campeonato(String dtaFinal_campeonato) {
		this.dtaFinal_campeonato = dtaFinal_campeonato;
	}
	public List<Rodada> getRodadas() {
		//Implementação da RN02 - Quantidade de rodadas
		rodadas = new ArrayList<Rodada>(19);
		return rodadas;
	}
	public void setRodadas(List<Rodada> rodadas) {
		if(rodadas.size() <= 19) {
			this.rodadas = rodadas;		
		}		
	}
	public List<Time> getTimes() {
		//Implementação da RN02 - Quantidade de times
		times = new ArrayList<Time>(20);
		return times;
	}
	public void setTimes(List<Time> times) {
		if(times.size() <= 20) {
		 this.times = times;
		}		
	}	  
}
