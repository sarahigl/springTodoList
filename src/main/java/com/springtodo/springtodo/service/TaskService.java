package com.springtodo.springtodo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtodo.springtodo.model.Task1;
import com.springtodo.springtodo.repository.TaskRepository1;

import lombok.Data;

@Data
@Service
public class TaskService {
    @Autowired
    private TaskRepository1 taskRepository1;

    public List<Task1> getAllTasks(){
        return(List<Task1>) taskRepository1.findAll();
    }

    public Task1 addTask(Task1 task1){
        return taskRepository1.save(task1);
    }
    public Optional<Task1> findById(Long task1){
        return taskRepository1.findById(task1);
    }

}
