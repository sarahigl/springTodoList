package com.springtodo.springtodo.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springtodo.springtodo.model.Category;
import com.springtodo.springtodo.service.CategoryService;


@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return categoryService.getAll();
    }
    @PostMapping("/addCategory")
    public void add(@RequestBody Category c) {
        System.out.println(c.toString());
        categoryService.add(c);
    }
    @GetMapping("/category/{id}")
    public Optional<Category> findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

}
