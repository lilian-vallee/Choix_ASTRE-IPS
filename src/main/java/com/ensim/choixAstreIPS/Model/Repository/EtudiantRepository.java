package com.ensim.choixAstreIPS.Model.Repository;

import com.ensim.choixAstreIPS.Model.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, String> {

}
