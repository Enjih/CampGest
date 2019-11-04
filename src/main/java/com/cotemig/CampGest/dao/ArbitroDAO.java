package com.cotemig.CampGest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.CampGest.model.Arbitro;

@Repository("atletaDAO")
public interface ArbitroDAO extends JpaRepository<Arbitro, Integer> {

}