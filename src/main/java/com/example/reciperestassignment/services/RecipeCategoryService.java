package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeCategoryDto;
import com.example.reciperestassignment.form.RecipeCategoryForm;

import java.util.List;

public interface RecipeCategoryService {

    RecipeCategoryDto create(RecipeCategoryForm recipeCategoryForm);

    void update(RecipeCategoryForm recipeCategoryForm, Integer recipeCategoryId);

    void deleteById(Integer recipeCategoryId);

    List<RecipeCategoryDto> findAll();

    RecipeCategoryDto findById(Integer recipeCategoryId);
}
