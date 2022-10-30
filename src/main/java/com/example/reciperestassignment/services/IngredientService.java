package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.IngredientDto;
import com.example.reciperestassignment.dto.RecipeCategoryDto;
import com.example.reciperestassignment.form.IngredientForm;
import com.example.reciperestassignment.form.RecipeCategoryForm;

import java.util.List;

public interface IngredientService {

    IngredientDto create(IngredientForm ingredientForm);

    void update(IngredientForm ingredientForm, Integer ingredientId);

    void deleteById(Integer ingredientId);

    List<IngredientDto> findAll();

    IngredientDto findById(Integer ingredientId);
}
