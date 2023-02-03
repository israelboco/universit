package com.isboco.universite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isboco.universite.model.Etudiant;
import com.isboco.universite.service.EtudiantService;

@RestController
public class EtudiantController {
	
	@Autowired
	private EtudiantService etudiantService;
	
	@GetMapping("/etudiants")
	public Iterable<Etudiant> getEtudiant(){
		return etudiantService.getEtudiant();
	}
}
