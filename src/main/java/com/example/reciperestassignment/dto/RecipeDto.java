package com.example.reciperestassignment.dto;


import com.example.reciperestassignment.entities.RecipeInstruction;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RecipeDto {

    private Integer recipeId;
    private String recipeName;
    private List<RecipeIngredientDto> recipeIngredientDtoList;
    private RecipeInstructionDto instructionDto;
    private Set<RecipeCategoryDto> recipeCategoryDtoSet = new HashSet<>();

}