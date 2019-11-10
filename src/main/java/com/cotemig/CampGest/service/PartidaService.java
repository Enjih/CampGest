package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.CampGest.model.Partida;

public interface PartidaService {
	
	Optional<Partida> getPartidaById(Integer id);
	List<Partida> getAllPartidas();
	void deleteAllPartidas();
	void deletePartidaById(Integer id);
	void updatePartidaById(Integer id, Partida Partida);
	void updatePartida(Partida Partida);
	void insertPartida(Partida Partida);

}
