package com.springtodo.springtodo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springtodo.springtodo.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
