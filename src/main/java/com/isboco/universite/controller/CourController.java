package com.isboco.universite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isboco.universite.model.Cour;
import com.isboco.universite.service.CourService;

@RestController
public class CourController {
	
	@Autowired
	private CourService courService;
	
	@GetMapping("/cours")
	public Iterable<Cour> getCour() {
		return courService.getCour();
	}

}
