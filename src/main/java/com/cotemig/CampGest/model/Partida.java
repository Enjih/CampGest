package com.cotemig.CampGest.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Partida {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cod_partida;

	@ManyToOne
	@JoinColumn(name="campeonato_id", nullable=false)
	private Campeonato campeonato;

	@ManyToOne
	@JoinColumn(name="estadio_id", nullable=false)
	private Estadio estadio;

	@ManyToOne
	@JoinColumn(name="rodada_id", nullable=false)
	private Rodada rodada;

	@ManyToMany
	@JoinColumn(name="partida_id", nullable=false)
	private List<Time> times;
	
	private Integer gol_time1;
	private Integer gol_time2;
	private Date data_partida;

	@OneToMany(mappedBy="partida")
	private List<Arbitro> arbitros;

	//Implementação RN01 - Pontuação dos jogos
	public void cauculaPontuacao(Time time1, Time time2, Integer gol_time1, Integer gol_time2){
		if(gol_time1 > gol_time2) {
			time1.setPontos(time1.getPontos() + 3);
			time1.setVitorias(time1.getVitorias() + 1);
			time1.setGols_pro(time1.getGols_pro() + gol_time1);
			time1.setGols_contra(time1.getGols_contra() + gol_time2);
			time2.setDerrotas(time2.getDerrotas() + 1);	
		} else if (gol_time2 > gol_time1) {
			time2.setPontos(time2.getPontos() + 3);
			time2.setVitorias(time2.getVitorias() + 1);
			time2.setGols_pro(time2.getGols_pro() + gol_time2);
			time2.setGols_contra(time2.getGols_contra() + gol_time1);
			time1.setDerrotas(time1.getDerrotas() + 1);			
		} else {
			time1.setPontos(time1.getPontos() + 1);
			time2.setPontos(time2.getPontos() + 1);
			time1.setEmpates(time1.getEmpates() + 1);
			time2.setEmpates(time2.getEmpates() + 1);			
			time1.setGols_pro(time1.getGols_pro() + gol_time1);
			time1.setGols_contra(time1.getGols_contra() + gol_time2);
			time2.setGols_pro(time2.getGols_pro() + gol_time2);
			time2.setGols_contra(time2.getGols_contra() + gol_time1);			
		}		
	}	
	public Integer getCod_partida() {
		return cod_partida;
	}
	public void setCod_partida(Integer cod_partida) {
		this.cod_partida = cod_partida;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	/*
	 * public Time getTime1() { return time1; } public void setTime1(Time time1) {
	 * this.time1 = time1; } public Time getTime2() { return time2; } public void
	 * setTime2(Time time2) { this.time2 = time2; }
	 */
	public Integer getGol_time1() {
		return gol_time1;
	}
	public void setGol_time1(Integer gol_time1) {
		this.gol_time1 = gol_time1;
	}
	public Integer getGol_time2() {
		return gol_time2;
	}
	public void setGol_time2(Integer gol_time2) {
		this.gol_time2 = gol_time2;
	}
	public Date getData_partida() {
		return data_partida;
	}
	public void setData_partida(Date data_partida) {
		this.data_partida = data_partida;
	}

	//Implementação da RN04 – Quantidade árbitros por partida
	public List<Arbitro> getArbitros() {
		arbitros = new ArrayList<Arbitro>(4);
		return arbitros;
	}
	public void setArbitros(List<Arbitro> arbitros) {
		if(arbitros.size() <= 4) {
			this.arbitros = arbitros;
		}
	}
}



