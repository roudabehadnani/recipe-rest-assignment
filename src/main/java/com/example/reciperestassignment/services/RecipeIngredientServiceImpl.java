package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeIngredientDto;
import com.example.reciperestassignment.form.RecipeIngredientForm;
import com.example.reciperestassignment.repository.RecipeIngredientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecipeIngredientServiceImpl implements RecipeIngredientService{

    private final ModelMapper modelMapper;
    private final RecipeIngredientRepository recipeIngredientRepository;

    @Autowired
    public RecipeIngredientServiceImpl(ModelMapper modelMapper, RecipeIngredientRepository recipeIngredientRepository) {
        this.modelMapper = modelMapper;
        this.recipeIngredientRepository = recipeIngredientRepository;
    }

    @Override
    public RecipeIngredientDto create(RecipeIngredientForm recipeIngredientForm) {
        return null;
    }

    @Override
    public void update(RecipeIngredientForm recipeIngredientForm, Integer recipeIngredientId) {

    }

    @Override
    public void deleteById(Integer recipeIngredientId) {

    }

    @Override
    public List<RecipeIngredientDto> findAll() {
        return null;
    }

    @Override
    public RecipeIngredientDto findById(Integer recipeIngredientId) {
        return null;
    }
}
