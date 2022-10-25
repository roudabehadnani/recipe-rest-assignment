package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeDto;

import java.util.List;

public interface RecipeService {

    RecipeDto create (RecipeDto recipeDto);
    void update (RecipeDto recipeDto, Integer id);
    void deleteById(Integer id);
    List<RecipeDto> findAllByCategory(String category);
    List<RecipeDto> findByIngredientName(String ingredientName);
    List<RecipeDto> findAll();
    RecipeDto findById(Integer id);
    List<RecipeDto> findByPartOfName(String name);
    RecipeDto findByRecipeName(String name);

}

