package com.cotemig.CampGest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.CampGest.model.Partida;

@Repository("partidaDAO")
public interface PartidaDAO extends JpaRepository<Partida, Integer> {

}
