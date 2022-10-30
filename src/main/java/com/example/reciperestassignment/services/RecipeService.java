package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeDto;
import com.example.reciperestassignment.form.RecipeForm;

import java.util.List;

public interface RecipeService {

    RecipeDto create (RecipeForm recipeForm);
    void update (RecipeForm recipeForm, Integer recipeId);
    void deleteById(Integer recipeId);
    List<RecipeDto> findAllByCategory(String category);
    List<RecipeDto> findByIngredientName(String ingredientName);
    List<RecipeDto> findAll();
    RecipeDto findById(Integer recipeId);
    List<RecipeDto> findByPartOfName(String name);
    RecipeDto findByRecipeName(String name);

}

