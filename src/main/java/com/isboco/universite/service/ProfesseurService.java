package com.isboco.universite.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isboco.universite.model.Professeur;
import com.isboco.universite.repository.ProfesseurRepository;

@Service
public class ProfesseurService {
	
	@Autowired
	private ProfesseurRepository professeurRepository;
	
	public Optional<Professeur> getProfesseur(final Long id) {
		return professeurRepository.findById(id);
	}
	
	public Iterable<Professeur> getProfesseur() {
		return professeurRepository.findAll();
	}
	
	public void deleteProfesseur(final Long id) {
		professeurRepository.deleteById(id);
	}

	public Professeur saveProfesseur(Professeur p) {
		Professeur savedProfesseur = professeurRepository.save(p);
		return savedProfesseur;
	}
}
