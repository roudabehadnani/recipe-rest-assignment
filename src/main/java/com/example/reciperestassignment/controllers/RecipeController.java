package com.example.reciperestassignment.controllers;

import com.example.reciperestassignment.dto.RecipeDto;
import com.example.reciperestassignment.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping("/api/recipes")
    public ResponseEntity<RecipeDto> createRecipe(@RequestBody RecipeDto recipeDto){
        RecipeDto newRecipe = recipeService.create(recipeDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newRecipe);
    }

    @PutMapping("/api/recipes/{id}")
    public ResponseEntity<Void> update(@RequestBody RecipeDto recipeDto, @PathVariable("id") Integer id){
        recipeService.update(recipeDto,id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/api/recipes/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        recipeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/api/recipes")
    public ResponseEntity<List<RecipeDto>> findAll(){
        return ResponseEntity.ok(recipeService.findAll());

    }

    @GetMapping("/api/recipes/category")
    public ResponseEntity<List<RecipeDto>> findAllByCategory(@RequestParam("category") String category){
        return ResponseEntity.ok(recipeService.findAllByCategory(category));

    }

    @GetMapping("/api/recipes/{id}")
    public ResponseEntity<RecipeDto> findById(@PathVariable("id") Integer id){
        System.out.println("############");
        System.out.println("Id" + id);
        return ResponseEntity.ok(recipeService.findById(id));
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







}
