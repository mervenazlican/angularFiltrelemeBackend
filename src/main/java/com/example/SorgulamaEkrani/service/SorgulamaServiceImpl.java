package com.example.SorgulamaEkrani.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SorgulamaEkrani.dao.SorgulamaDao;
import com.example.SorgulamaEkrani.model.Filtreleme;

@Service
public class SorgulamaServiceImpl implements SorgulamaService{

	@Autowired
	private SorgulamaDao sorgulamaDao;
	
	@Override
	public List<Filtreleme> getAllDataList() {
		return sorgulamaDao.findAll();
	}

 

}
