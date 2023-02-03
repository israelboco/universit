package com.isboco.universite.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isboco.universite.model.Professeur;

@Repository
public interface ProfesseurRepository extends CrudRepository<Professeur, Long>{

}
