package com.cotemig.CampGest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.CampGest.model.Estadio;

@Repository("estadioDAO")
public interface EstadioDAO extends JpaRepository<Estadio, Integer> {

}