package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.CampGest.model.Estadio;

public interface EstadioService {
	
	Optional<Estadio> getEstadioById(Integer id);
	List<Estadio> getAllEstadios();
	void deleteAllEstadios();
	void deleteEstadioById(Integer id);
	void updateEstadioById(Integer id, Estadio Estadio);
	void updateEstadio(Estadio estadio);
	void insertEstadio(Estadio estadio);

}
