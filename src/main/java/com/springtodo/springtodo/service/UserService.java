package com.springtodo.springtodo.service;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.springtodo.springtodo.model.User1;
import com.springtodo.springtodo.repository.UserRepository1;

import lombok.Data;

//@Data
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository1 userRepository1;
    private final PasswordEncoder encoder;

    public UserService(UserRepository1 repository, PasswordEncoder encoder) {
        this.userRepository1 = repository;
        this.encoder = encoder;
    }

    //Méthode pour récupérer le compte qui va se connecte
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User1> userDetail = userRepository1.findByEmail(email);
        return userDetail.map(UserInfoDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found " + email));
    }

    //Méthode pour ajouter un compte en BDD
    public String addUser(User1 user1) {
        user1.setPassword(encoder.encode(user1.getPassword()));
        userRepository1.save(user1);
        return "User Added Successfully";
    }

    //autre
    public List<User1> getAllUsers(){
        return(List<User1>) userRepository1.findAll();
    }

    public User1 addUser2(User1 user){
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
