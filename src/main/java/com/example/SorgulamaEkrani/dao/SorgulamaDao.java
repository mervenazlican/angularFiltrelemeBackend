package com.example.SorgulamaEkrani.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SorgulamaEkrani.model.Filtreleme;

@Repository
public interface SorgulamaDao extends JpaRepository<Filtreleme, Integer> {
	
}
