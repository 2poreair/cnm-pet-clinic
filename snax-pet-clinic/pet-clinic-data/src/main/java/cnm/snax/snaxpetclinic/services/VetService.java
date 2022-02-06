package cnm.snax.snaxpetclinic.services;

import cnm.snax.snaxpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
