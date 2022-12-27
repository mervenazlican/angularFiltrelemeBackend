package com.example.SorgulamaEkrani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SorgulamaEkrani.model.Filtreleme;
import com.example.SorgulamaEkrani.service.SorgulamaServiceImpl;

@RestController
@RequestMapping("/sorgulama")
@CrossOrigin("http://localhost:4200")
public class SorgulamaController {
	
	@Autowired
	private SorgulamaServiceImpl sorgulamaServiceImpl;
	
	public SorgulamaController(SorgulamaServiceImpl sorgulamaServiceImpl) {
		this.sorgulamaServiceImpl=sorgulamaServiceImpl;
	}
	  
	@GetMapping
	public List<Filtreleme> getAllDataList(){
		return sorgulamaServiceImpl.getAllDataList();
	}
	

}
