package com.example.reciperestassignment.dto;

import com.example.reciperestassignment.entities.RecipeCategory;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RecipeDto {

    private int recipeId;
    private String recipeName;
    private Set<RecipeCategory> categories;


}
