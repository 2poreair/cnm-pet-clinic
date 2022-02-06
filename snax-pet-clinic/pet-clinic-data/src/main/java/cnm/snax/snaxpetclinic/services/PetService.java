package cnm.snax.snaxpetclinic.services;

import cnm.snax.snaxpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
