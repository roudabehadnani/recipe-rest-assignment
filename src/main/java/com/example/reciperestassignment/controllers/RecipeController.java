package com.example.reciperestassignment.controllers;

import com.example.reciperestassignment.dto.RecipeCategoryDto;
import com.example.reciperestassignment.dto.RecipeDto;
import com.example.reciperestassignment.form.RecipeForm;
import com.example.reciperestassignment.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    private final RecipeService recipeService;
    private final RecipeInstructionService recipeInstructionService;
    private final IngredientService ingredientService;
    private final RecipeCategoryService recipeCategoryService;
    private final RecipeIngredientService recipeIngredientService;

    @Autowired
    public RecipeController(RecipeService recipeService, RecipeInstructionService recipeInstructionService, IngredientService ingredientService, RecipeCategoryService recipeCategoryService, RecipeIngredientService recipeIngredientService) {
        this.recipeService = recipeService;
        this.recipeInstructionService = recipeInstructionService;
        this.ingredientService = ingredientService;
        this.recipeCategoryService = recipeCategoryService;
        this.recipeIngredientService = recipeIngredientService;
    }

    @PostMapping("/api/recipes")
    public ResponseEntity<RecipeDto> createRecipe(@RequestBody RecipeForm recipeForm){
        RecipeDto newRecipe = recipeService.create(recipeForm);
        return ResponseEntity.status(HttpStatus.CREATED).body(newRecipe);
    }

    @PutMapping("/api/recipes/{id}")
    public ResponseEntity<Void> update(@RequestBody RecipeForm recipeForm, @PathVariable("id") Integer id){
        recipeService.update(recipeForm,id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/api/recipes/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        recipeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/api/recipes")
    public ResponseEntity<List<RecipeDto>> findAll(){
        List<RecipeDto> allRecipe = recipeService.findAll();
        return ResponseEntity.ok(allRecipe);
    }

    @GetMapping("/api/recipes/category")
    public ResponseEntity<List<RecipeDto>> findAllByCategory(@RequestParam("category") String category){
        return ResponseEntity.ok(recipeService.findAllByCategory(category));
    }

    @GetMapping("/api/recipes/{id}")
    public ResponseEntity<RecipeDto> findById(@PathVariable("id") Integer id){
        System.out.println("############");
        System.out.println("Id" + id);
        RecipeDto recipeById = recipeService.findById(id);
        return ResponseEntity.ok(recipeById);
    }

    @GetMapping("/api/recipes/recipe")
    public ResponseEntity<RecipeDto> findRecipeByName(@RequestParam("name") String name){
        return ResponseEntity.ok(recipeService.findByRecipeName(name));
    }

    @GetMapping("/api/recipes/recipe/search")
    public ResponseEntity<List<RecipeDto>> findRecipeByPartName(@RequestParam("name") String name){
        return ResponseEntity.ok(recipeService.findByPartOfName(name));
    }

    @GetMapping("/api/recipes/ingredient")
    public ResponseEntity<List<RecipeDto>> findRecipeByIngredient(@RequestParam("ingredient") String name){
        return ResponseEntity.ok(recipeService.findByPartOfName(name));
    }

    //-----------------------------------------------------------------


    @GetMapping("/api/recipes/category/{categoryId}")
    public ResponseEntity<RecipeCategoryDto> findCategoryById(@PathVariable("categoryId") Integer recipeCategoryId){
        RecipeCategoryDto findCategory = recipeCategoryService.findById(recipeCategoryId);
        return ResponseEntity.ok(findCategory);
    }




}
