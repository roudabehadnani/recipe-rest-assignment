package com.example.reciperestassignment.repository;

import com.example.reciperestassignment.entities.RecipeInstruction;
import org.springframework.data.repository.CrudRepository;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction, Integer> {
}
