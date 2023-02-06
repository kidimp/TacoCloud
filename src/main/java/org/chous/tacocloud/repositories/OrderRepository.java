package org.chous.tacocloud.repositories;

import org.chous.tacocloud.models.TacoOrder;

import java.util.Optional;


public interface OrderRepository {

    TacoOrder save(TacoOrder order);

}