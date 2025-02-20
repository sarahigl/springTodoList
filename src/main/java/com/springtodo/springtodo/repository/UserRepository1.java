package com.springtodo.springtodo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springtodo.springtodo.model.User1;

@Repository
public interface UserRepository1  extends CrudRepository<User1, Long>{

}
