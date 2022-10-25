package com.example.reciperestassignment.repository;

import com.example.reciperestassignment.entities.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, String> {
}
