package cnm.snax.petclinic.services;

import cnm.snax.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLasName(String lastName);
}
