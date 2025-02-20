package com.springtodo.springtodo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springtodo.springtodo.model.Task1;
import com.springtodo.springtodo.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TaskController1 {
    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task1> getTasks() {
        return taskService.getAllTasks();
    }
    @PostMapping("/addTask")
    public void addTask(@RequestBody Task1 task1) {
        System.out.println(task1.toString());
        taskService.addTask(task1);
    }
    @GetMapping("/task/{id}")
    public Optional<Task1> findById(@PathVariable Long id) {
        return taskService.findById(id);
    }
    
    
}
