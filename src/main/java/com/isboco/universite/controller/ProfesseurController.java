package com.isboco.universite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isboco.universite.model.Professeur;
import com.isboco.universite.service.ProfesseurService;

@RestController
public class ProfesseurController {
	
	@Autowired
	private ProfesseurService professeurService;
	
	@GetMapping("/professeurs")
	public Iterable<Professeur> getProfesseur(){
		return professeurService.getProfesseur();
	}

}
