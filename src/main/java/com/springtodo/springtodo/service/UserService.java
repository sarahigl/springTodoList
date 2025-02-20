package com.springtodo.springtodo.service;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springtodo.springtodo.model.User1;
import com.springtodo.springtodo.repository.UserRepository1;

import lombok.Data;

@Data
@Service
public class UserService {
 @Autowired
    private UserRepository1 userRepository1;

    public List<User1> getAllUsers(){
        return(List<User1>) userRepository1.findAll();
    }

    public User1 addUser(User1 user){
        return userRepository1.save(user);
    }
    public Optional<User1> findById(Long id){
        return userRepository1.findById(id);
    }
   /*  public Stream<DtoUser> getUserDTO(Long id){
        return userRepository1.findById(id).stream()
                .map(UserDtoWrapper::toDto);
    } */
}
