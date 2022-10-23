package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeDto;
import com.example.reciperestassignment.entities.Recipe;
import com.example.reciperestassignment.repository.RecipeRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final ModelMapper modelMapper;
    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl(ModelMapper modelMapper, RecipeRepository recipeRepository) {
        this.modelMapper = modelMapper;
        this.recipeRepository = recipeRepository;
    }

    @Override
    public RecipeDto create(RecipeDto recipeDto) {
        Recipe recipeToEntity = modelMapper.map(recipeDto, Recipe.class);
        Recipe saveRecipe = recipeRepository.save(recipeToEntity);
        RecipeDto recipeToDto = modelMapper.map(saveRecipe, RecipeDto.class);
        return recipeDto;
    }

    @Override
    public void update(RecipeDto recipeDto, Integer id) {

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
    public RecipeDto findById(Integer id) {
        if (id == null) throw new IllegalArgumentException("Id was null");

        Recipe foundRecipe = recipeRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Recipe Not Found"));

        RecipeDto dto = modelMapper.map(foundRecipe, RecipeDto.class);
        return dto;
    }

    @Override
    public RecipeDto findByName(String name) {
        if (name == null) throw new IllegalArgumentException("name was null");

        List<Recipe> foundRecipes = recipeRepository.findRecipesByPartOfRecipeName(name);
        RecipeDto dtoList = modelMapper.map(foundRecipes,RecipeDto.class);
        return dtoList;
    }
}
