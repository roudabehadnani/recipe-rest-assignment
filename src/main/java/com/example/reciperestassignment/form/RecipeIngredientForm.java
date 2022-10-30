package com.example.reciperestassignment.form;

import com.example.reciperestassignment.entities.Ingredient;
import com.example.reciperestassignment.entities.Measurement;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RecipeIngredientForm {

    private Ingredient ingredient;
    private double amount;
    private Measurement measurement;




}
