package com.springtodo.springtodo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springtodo.springtodo.model.Role;
import com.springtodo.springtodo.service.RoleService;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
     @GetMapping("/roles")
    public List<Role> getTasks() {
        return roleService.getAllRoles();
    }
    @PostMapping("/addRole")
    public void addTask(@RequestBody Role role) {
        System.out.println(role.toString());
        roleService.addRole(role);
    }
    @GetMapping("/role/{id}")
    public Optional<Role> findById(@PathVariable Long id) {
        return roleService.findById(id);
    }

}
