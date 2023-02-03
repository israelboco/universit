package com.isboco.universite.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.isboco.universite.model.Cour;

@Repository
public interface CourRepository extends CrudRepository<Cour, Long>{

}
