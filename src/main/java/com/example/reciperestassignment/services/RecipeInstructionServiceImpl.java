package com.example.reciperestassignment.services;

import com.example.reciperestassignment.dto.RecipeInstructionDto;
import com.example.reciperestassignment.entities.RecipeInstruction;
import com.example.reciperestassignment.repository.RecipeInstructionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeInstructionServiceImpl implements RecipeInstructionService{

    private final RecipeInstructionRepository recipeInstructionRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RecipeInstructionServiceImpl(RecipeInstructionRepository recipeInstructionRepository, ModelMapper modelMapper) {
        this.recipeInstructionRepository = recipeInstructionRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public RecipeInstructionService create(RecipeInstructionDto recipeInstructionDto) {
        return null;
    }

    @Override
    public void update(RecipeInstructionDto recipeInstructionDto, Integer id) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<RecipeInstructionDto> findAll() {
        return null;
    }

    @Override
    public RecipeInstructionDto findById(Integer id) {
        RecipeInstruction found = recipeInstructionRepository.findById(id).orElseThrow(
                () -> new RuntimeException("")
        );
        RecipeInstructionDto dto = modelMapper.map(found, RecipeInstructionDto.class);
        return dto;
    }
}
