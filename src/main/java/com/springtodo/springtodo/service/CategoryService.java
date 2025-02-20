package com.springtodo.springtodo.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtodo.springtodo.model.Category;
import com.springtodo.springtodo.repository.CategoryRepository;

import lombok.Data;

@Data
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return(List<Category>) categoryRepository.findAll();
    }

    public Category add(Category category){
        return categoryRepository.save(category);
    }
    public Optional<Category> findById(Long Category){
        return categoryRepository.findById(Category);
    }
}
