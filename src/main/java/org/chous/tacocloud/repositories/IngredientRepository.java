package org.chous.tacocloud.repositories;

import org.chous.tacocloud.models.Ingredient;

import java.util.Optional;


public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);

}
