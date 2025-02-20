package com.springtodo.springtodo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springtodo.springtodo.model.Task1;

@Repository
public interface TaskRepository1 extends CrudRepository<Task1, Long>{

}
