package com.example.reciperestassignment.dto;

import com.example.reciperestassignment.entities.Measurement;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RecipeIngredientDto {

    private String recipeIngredientId;
    private IngredientDto ingredient;
    private Double amount;
    private Measurement measurement;
}
