package org.programarteduele.app.repository;

import org.programarteduele.app.entity.Pet;
import org.springframework.data.repository.CrudRepository;


public interface PetRepository extends CrudRepository<Pet, Long>{
      

}
