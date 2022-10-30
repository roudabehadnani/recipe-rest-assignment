package com.example.reciperestassignment.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RecipeInstructionDto {

    private Integer recipeInstructionId;
    private String instructions;

}
