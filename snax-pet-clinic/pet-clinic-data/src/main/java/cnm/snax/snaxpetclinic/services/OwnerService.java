package cnm.snax.snaxpetclinic.services;

import cnm.snax.snaxpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLasName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
