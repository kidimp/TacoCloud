package org.chous.tacocloud.repositories;

import org.chous.tacocloud.models.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
