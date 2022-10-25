package com.example.reciperestassignment.repository;

import com.example.reciperestassignment.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {

    //--Search for one ingredient object that matches exactly with sent in ingredient name
    Optional<Ingredient> findIngredientByIngredientName(String name);

    //--Search for ingredients that contains parts of sent in ingredient name
    @Query("SELECT i FROM Ingredient i WHERE LOWER(i.ingredientName) LIKE LOWER(CONCAT('%', :name , '%'))")
    List<Ingredient> findIngredientByPartOfIngredientName (@Param("name") String name);

}
