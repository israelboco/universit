package com.isboco.universite.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isboco.universite.model.Cour;
import com.isboco.universite.repository.CourRepository;

@Service
public class CourService {
	
	@Autowired
	private CourRepository courRepository;
	
	public Optional<Cour> getCour(final Long id) {
		return courRepository.findById(id);
	}
	
	public Iterable<Cour> getCour(){
		return courRepository.findAll()
	}
	
	public void deleteCour(final Long id) {
		courRepository.deleteById(id);
	}
	
	public Cour saveCour(Cour c) {
		Cour savedCour = courRepository.save(c);
		return savedCour;
	}

}
