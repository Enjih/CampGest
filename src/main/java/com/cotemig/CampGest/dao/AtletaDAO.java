package com.cotemig.CampGest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.CampGest.model.Atleta;

@Repository("atletaDAO")
public interface AtletaDAO extends JpaRepository<Atleta, Integer> {

}