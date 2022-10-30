package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeDto;
import com.example.reciperestassignment.dto.RecipeInstructionDto;

import java.util.List;

public interface RecipeInstructionService {

    RecipeInstructionService create (RecipeInstructionDto recipeInstructionDto);
    void update (RecipeInstructionDto recipeInstructionDto, Integer id);
    void deleteById(Integer id);
    List<RecipeInstructionDto> findAll();
    RecipeInstructionDto findById(Integer id);
}
