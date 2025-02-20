package com.springtodo.springtodo.service;

import org.springframework.stereotype.Service;

import com.springtodo.springtodo.dto.DtoUser;
import com.springtodo.springtodo.model.User1;

@Service
public class UserDtoWrapper {
    public static DtoUser toDto(User1 user){
            return new DtoUser(
                user.getLastname(), 
                user.getLastname(), 
                user.getEmail()
                
                
                );

    }
}
