package com.example.reciperestassignment.repository;

import com.example.reciperestassignment.entities.RecipeInstruction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeInstructionRepository extends JpaRepository<RecipeInstruction, Integer> {
}
