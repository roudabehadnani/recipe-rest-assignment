package com.example.reciperestassignment.form;

import com.example.reciperestassignment.entities.RecipeCategory;
import com.example.reciperestassignment.entities.RecipeIngredient;
import com.example.reciperestassignment.entities.RecipeInstruction;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RecipeForm {

    private String recipeName;
    private List<RecipeIngredient> recipeIngredients;
    private RecipeInstruction instruction;
    private Set<RecipeCategory> categories;


}
