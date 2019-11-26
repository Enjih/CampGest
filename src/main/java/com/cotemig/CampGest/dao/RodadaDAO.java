package com.cotemig.CampGest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.CampGest.model.Rodada;

	@Repository("rodadaDAO")
	public interface RodadaDAO extends JpaRepository<Rodada, Integer> {

}

