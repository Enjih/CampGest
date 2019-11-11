package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.CampGest.model.Arbitro;

public interface ArbitroService {

	Optional<Arbitro> getArbitroById(Integer id);
	List<Arbitro> getAllArbitros();
	void deleteAllArbitros();
	void deleteArbitroById(Integer id);
	void updateArbitroById(Integer id, Arbitro Arbitro);
	void updateArbitro(Arbitro Arbitro);
	void insertArbitro(Arbitro Arbitro);
	
}
