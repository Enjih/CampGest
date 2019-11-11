package com.cotemig.CampGest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Partida {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer cod_partida;
	
  private Integer cod_campeonato;
  private Integer cod_estadio;
  private Integer timeVencedor;
  private Integer cod_time1;
  private Integer cod_time2;
  private Integer gol_time1;
  private Integer gol_time2;
  private String nome_time1;
  private String nome_time2;
  private String nome_estadio;
  private String nome_campeonato;
  private Date data_partida;
  private Integer cod_arbitro;
  
public Integer getCod_partida() {
	return cod_partida;
}
public void setCod_partida(Integer cod_partida) {
	this.cod_partida = cod_partida;
}
public Integer getCod_campeonato() {
	return cod_campeonato;
}
public void setCod_campeonato(Integer cod_campeonato) {
	this.cod_campeonato = cod_campeonato;
}
public Integer getCod_estadio() {
	return cod_estadio;
}
public void setCod_estadio(Integer cod_estadio) {
	this.cod_estadio = cod_estadio;
}
public Integer getTimeVencedor() {
	return timeVencedor;
}
public void setTimeVencedor(Integer timeVencedor) {
	this.timeVencedor = timeVencedor;
}
public Integer getCod_time1() {
	return cod_time1;
}
public void setCod_time1(Integer cod_time1) {
	this.cod_time1 = cod_time1;
}
public Integer getCod_time2() {
	return cod_time2;
}
public void setCod_time2(Integer cod_time2) {
	this.cod_time2 = cod_time2;
}
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
public String getNome_time1() {
	return nome_time1;
}
public void setNome_time1(String nome_time1) {
	this.nome_time1 = nome_time1;
}
public String getNome_time2() {
	return nome_time2;
}
public void setNome_time2(String nome_time2) {
	this.nome_time2 = nome_time2;
}
public String getNome_estadio() {
	return nome_estadio;
}
public void setNome_estadio(String nome_estadio) {
	this.nome_estadio = nome_estadio;
}
public String getNome_campeonato() {
	return nome_campeonato;
}
public void setNome_campeonato(String nome_campeonato) {
	this.nome_campeonato = nome_campeonato;
}
public Date getData_partida() {
	return data_partida;
}
public void setData_partida(Date data_partida) {
	this.data_partida = data_partida;
}
public Integer getCod_arbitro() {
	return cod_arbitro;
}
public void setCod_arbitro(Integer cod_arbitro) {
	this.cod_arbitro = cod_arbitro;
}	  
	  
	
}
	  
	  
	  
	