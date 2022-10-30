package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeCategoryDto;
import com.example.reciperestassignment.dto.RecipeDto;
import com.example.reciperestassignment.dto.RecipeInstructionDto;
import com.example.reciperestassignment.entities.Recipe;
import com.example.reciperestassignment.entities.RecipeInstruction;
import com.example.reciperestassignment.exception.ResourceNotFoundException;
import com.example.reciperestassignment.form.RecipeForm;
import com.example.reciperestassignment.repository.RecipeInstructionRepository;
import com.example.reciperestassignment.repository.RecipeRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final ModelMapper modelMapper;
    private final RecipeRepository recipeRepository;
    private final RecipeInstructionRepository instructionRepository;

    public RecipeServiceImpl(ModelMapper modelMapper, RecipeRepository recipeRepository, RecipeInstructionRepository instructionRepository) {
        this.modelMapper = modelMapper;
        this.recipeRepository = recipeRepository;
        this.instructionRepository = instructionRepository;
    }

    @Override
    public RecipeDto create(RecipeForm recipeForm) {
        Recipe recipeToEntity = modelMapper.map(recipeForm, Recipe.class);
        Recipe saveRecipe = recipeRepository.save(recipeToEntity);
        RecipeDto recipeToDto = modelMapper.map(saveRecipe, RecipeDto.class);
        return recipeToDto;
    }

    @Override
    public void update(RecipeForm recipeForm, Integer recipeId) {
        if (recipeForm == null) throw new IllegalArgumentException("Recipe was null");
        if (recipeId == 0) throw new IllegalArgumentException("Recipe id can not be null");

        Recipe recipe = modelMapper.map(recipeForm, Recipe.class);
        recipeRepository.save(recipe);
    }

    @Override
    public void deleteById(Integer id) {
        recipeRepository.deleteById(id);
    }

    @Override
    public List<RecipeDto> findAllByCategory(String category) {

        List<Recipe> listOfRecipe = recipeRepository.findAllByCategoriesCategoryIgnoreCase(category);
        List<RecipeDto> dtoList = modelMapper.map(listOfRecipe, new TypeToken<List<RecipeDto>>(){}.getType());
        return dtoList;
    }

    @Override
    public List<RecipeDto> findAll(){

        List<Recipe> listOfRecipe = recipeRepository.findAll();
        List<RecipeDto> dtoList = modelMapper.map(listOfRecipe, new TypeToken<List<RecipeDto>>(){}.getType());
        return dtoList;
    }


    @Override
    public RecipeDto findById(Integer recipeId) {
        if (recipeId == null) throw new IllegalArgumentException("Id was null");

        Recipe foundRecipe = recipeRepository.findById(recipeId).orElseThrow(
                () -> new ResourceNotFoundException("Recipe Not Found"));

        RecipeDto dto = modelMapper.map(foundRecipe, RecipeDto.class);


//        Set<RecipeCategoryDto> list = new HashSet<>();
//        for (RecipeCategoryDto item : dto.getRecipeCategoryDtoSet()) {
//            list.add(new RecipeCategoryDto(item.getRecipeCategoryId(), item.getCategory()));
//        }
//        return new RecipeDto(dto.getRecipeId(), dto.getRecipeName(), list);
        return dto;
    }

    @Override
    public List<RecipeDto> findByPartOfName(String name) {
        if (name == null) throw new IllegalArgumentException("name was null");

        List<Recipe> foundRecipes = recipeRepository.findRecipesByPartOfRecipeName(name);
        List<RecipeDto> dtoList = modelMapper.map(foundRecipes,new TypeToken<List<RecipeDto>>(){}.getType());
        return dtoList;
    }

    @Override
    public RecipeDto findByRecipeName(String name) {
        if (name == null) throw new IllegalArgumentException("name was null");
        Recipe recipe = recipeRepository.findByRecipeName(name);
        RecipeDto dto = modelMapper.map(recipe,RecipeDto.class);
        return dto;
    }

    @Override
    public List<RecipeDto> findByIngredientName(String ingredientName) {
        List<Recipe> recipes = recipeRepository.findRecipesByRecipeIngredientsIngredientIngredientNameIgnoreCase(ingredientName);
        List<RecipeDto> dtoList = modelMapper.map(recipes, new TypeToken<List<RecipeDto>>(){}.getType());
        return dtoList;
    }
}
