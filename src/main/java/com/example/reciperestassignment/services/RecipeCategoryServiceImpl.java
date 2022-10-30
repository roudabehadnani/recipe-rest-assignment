package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeCategoryDto;
import com.example.reciperestassignment.dto.RecipeDto;
import com.example.reciperestassignment.entities.Recipe;
import com.example.reciperestassignment.entities.RecipeCategory;
import com.example.reciperestassignment.form.RecipeCategoryForm;
import com.example.reciperestassignment.repository.RecipeCategoryRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeCategoryServiceImpl implements RecipeCategoryService{

    private final RecipeCategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RecipeCategoryServiceImpl(RecipeCategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public RecipeCategoryDto create(RecipeCategoryForm recipeCategoryForm) {
        RecipeCategory toEntity = modelMapper.map(recipeCategoryForm, RecipeCategory.class);
        RecipeCategory save = categoryRepository.save(toEntity);
        RecipeCategoryDto toDto = modelMapper.map(save, RecipeCategoryDto.class);
        return toDto;
    }

    @Override
    public void update(RecipeCategoryForm recipeCategoryForm, Integer recipeCategoryId) {
        if (recipeCategoryForm == null) throw new IllegalArgumentException("Recipe Category was null");
        if (recipeCategoryId == 0) throw new IllegalArgumentException("Recipe Category id can not be null");

        RecipeCategory recipeCategory = modelMapper.map(recipeCategoryForm, RecipeCategory.class);
        categoryRepository.save(recipeCategory);
    }

    @Override
    public void deleteById(Integer recipeCategoryId) {
        categoryRepository.deleteById(recipeCategoryId);
    }

    @Override
    public List<RecipeCategoryDto> findAll() {
        List<RecipeCategory> listOfRecipeCategory = categoryRepository.findAll();
        List<RecipeCategoryDto> dtoList = modelMapper.map(listOfRecipeCategory, new TypeToken<List<RecipeCategoryDto>>(){}.getType());
        return dtoList;
    }

    @Override
    public RecipeCategoryDto findById(Integer recipeCategoryId) {
        if (recipeCategoryId == null) throw new IllegalArgumentException("recipe Category Id is null");
        RecipeCategory found = categoryRepository.findById(recipeCategoryId).orElseThrow(
                () -> new RuntimeException("Recipe Category NOT found")
        );
        RecipeCategoryDto dto = modelMapper.map(found, RecipeCategoryDto.class);
        return dto;
    }
}
