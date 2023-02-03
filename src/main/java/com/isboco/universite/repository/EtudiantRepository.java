package com.isboco.universite.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.isboco.universite.model.Etudiant;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Long>{

}
