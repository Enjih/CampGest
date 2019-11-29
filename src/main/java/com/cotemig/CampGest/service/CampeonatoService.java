package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.CampGest.model.Campeonato;

public interface CampeonatoService {
	
	Optional<Campeonato> getCampeonatoById(Integer id);
	List<Campeonato> getAllCampeonatos();
	void deleteAllCampeonatos();
	void deleteCampeonatoById(Integer id);
	void updateCampeonatoById(Integer id, Campeonato Campeonato);
	void updateCampeonato(Campeonato campeonato);
	void insertCampeonato(Campeonato campeonato);

}
