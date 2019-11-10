package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.CampGest.model.Clube;

public interface ClubeService {
	
	Optional<Clube> getClubeById(Integer id);
	List<Clube> getAllClubes();
	void deleteAllClubes();
	void deleteClubeById(Integer id);
	void updateClubeById(Integer id, Clube Clube);
	void updateClube(Clube Clube);
	void insertClube(Clube Clube);

}
