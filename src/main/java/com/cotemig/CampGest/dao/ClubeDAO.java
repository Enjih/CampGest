package com.cotemig.CampGest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.CampGest.model.Clube;

@Repository("clubeDAO")
public interface ClubeDAO extends JpaRepository<Clube, Integer> {

}
  