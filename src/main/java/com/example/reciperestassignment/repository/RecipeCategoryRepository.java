package com.example.reciperestassignment.repository;

import com.example.reciperestassignment.entities.RecipeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeCategoryRepository extends JpaRepository<RecipeCategory, Integer> {
}
