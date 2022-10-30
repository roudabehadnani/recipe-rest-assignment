package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeCategoryDto;
import com.example.reciperestassignment.dto.RecipeIngredientDto;
import com.example.reciperestassignment.form.RecipeCategoryForm;
import com.example.reciperestassignment.form.RecipeIngredientForm;

import java.util.List;

public interface RecipeIngredientService {

    RecipeIngredientDto create(RecipeIngredientForm recipeIngredientForm);

    void update(RecipeIngredientForm recipeIngredientForm, Integer recipeIngredientId);

    void deleteById(Integer recipeIngredientId);

    List<RecipeIngredientDto> findAll();

    RecipeIngredientDto findById(Integer recipeIngredientId);
}
