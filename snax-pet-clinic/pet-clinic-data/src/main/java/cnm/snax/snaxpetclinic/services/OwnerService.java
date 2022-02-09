package cnm.snax.snaxpetclinic.services;

import cnm.snax.snaxpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLasName(String lastName);
}
