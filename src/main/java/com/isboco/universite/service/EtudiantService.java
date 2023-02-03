package com.isboco.universite.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isboco.universite.model.Etudiant;
import com.isboco.universite.repository.EtudiantRepository;

@Service
public class EtudiantService {
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	public Optional<Etudiant> getEtudiant(final Long id){
		return etudiantRepository.findById(id);
	}
	
	public Iterable<Etudiant> getEtudiant(){
		return etudiantRepository.findAll();
	}
	
	public void deleteEtudiant(final Long id) {
		etudiantRepository.deleteById(id);
	}
	
	public Etudiant saveEtudiant(Etudiant e) {
		Etudiant savedEtudiant = etudiantRepository.save(e);
		return savedEtudiant;
	}
	

}
