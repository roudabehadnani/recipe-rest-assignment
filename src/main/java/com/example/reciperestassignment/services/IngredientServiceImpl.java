package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.IngredientDto;
import com.example.reciperestassignment.form.IngredientForm;
import com.example.reciperestassignment.repository.IngredientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class IngredientServiceImpl implements IngredientService{

    private final ModelMapper modelMapper;
    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientServiceImpl(ModelMapper modelMapper, IngredientRepository ingredientRepository) {
        this.modelMapper = modelMapper;
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public IngredientDto create(IngredientForm ingredientForm) {
        return null;
    }

    @Override
    public void update(IngredientForm ingredientForm, Integer ingredientId) {

    }

    @Override
    public void deleteById(Integer ingredientId) {

    }

    @Override
    public List<IngredientDto> findAll() {
        return null;
    }

    @Override
    public IngredientDto findById(Integer ingredientId) {
        return null;
    }
}
