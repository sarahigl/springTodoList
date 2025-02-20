package com.springtodo.springtodo.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springtodo.springtodo.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
