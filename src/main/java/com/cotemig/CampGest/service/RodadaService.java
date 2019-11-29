package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.CampGest.model.Rodada;

public interface RodadaService {

	Optional<Rodada> getRodadaById(Integer id);
	List<Rodada> getAllRodada();
	void deleteAllRodadas();
	void deleteRodadaById(Integer id);
	void updateRodadaById(Integer id, Rodada Rodada);
	void updateRodada(Rodada Rodada);
	void insertRodada(Rodada Rodada);
}
