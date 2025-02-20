package com.springtodo.springtodo.service;

import org.springframework.stereotype.Service;

import com.springtodo.springtodo.dto.userDto;
import com.springtodo.springtodo.model.User1;

@Service
public class UserDtoWrapper {
    public static userDto toDto(User1 user){
            return new userDto(user.getLastname(), user.getLastname(), user.getEmail());

    }

}
