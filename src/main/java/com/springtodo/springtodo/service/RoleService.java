package com.springtodo.springtodo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtodo.springtodo.model.Role;
import com.springtodo.springtodo.repository.RoleRepository;

import lombok.Data;

@Data
@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    
    public List<Role> getAllRoles(){
        return(List<Role>) roleRepository.findAll();
    }

    public Role addRole(Role role){
        return roleRepository.save(role);
    }
    public Optional<Role> findById(Long id){
        return roleRepository.findById(id);
    }
}
