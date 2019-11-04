package com.cotemig.CampGest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.CampGest.model.Campeonato;

@Repository("campeonatoDAO")
public interface CampeonatoDAO extends JpaRepository<Campeonato, Integer> {

}
