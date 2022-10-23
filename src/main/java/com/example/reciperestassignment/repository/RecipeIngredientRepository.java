package com.example.reciperestassignment.repository;

import com.example.reciperestassignment.entities.RecipeIngredient;
import org.springframework.data.repository.CrudRepository;

public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient, String> {
}
