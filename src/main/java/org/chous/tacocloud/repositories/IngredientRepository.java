package org.chous.tacocloud.repositories;

import org.chous.tacocloud.models.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}