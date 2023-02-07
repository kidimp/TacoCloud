package org.chous.tacocloud.repositories;

import org.chous.tacocloud.models.TacoOrder;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}