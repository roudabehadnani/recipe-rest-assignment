package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeDto;

import java.util.List;

public interface RecipeService {

    RecipeDto create (RecipeDto recipeDto);
    void update (RecipeDto recipeDto, Integer id);
    void deleteById(Integer id);
    List<RecipeDto> findAllByCategory(String category);
    List<RecipeDto> findAll();
    RecipeDto findById(Integer id);
    RecipeDto findByName(String name);

}

