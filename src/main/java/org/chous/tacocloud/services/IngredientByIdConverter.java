package org.chous.tacocloud.services;

import org.chous.tacocloud.models.Ingredient;
import org.chous.tacocloud.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private final IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}