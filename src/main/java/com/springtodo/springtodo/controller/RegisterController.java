package com.springtodo.springtodo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springtodo.springtodo.model.AuthRequest;
import com.springtodo.springtodo.model.User1;
import com.springtodo.springtodo.service.JWTService;
import com.springtodo.springtodo.service.UserService;

@RestController
public class RegisterController {
     @Autowired
    private JWTService jwtService;

    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity<String> connexion(@RequestBody AuthRequest authRequest){
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
        );
        if(authentication.isAuthenticated()){
            String token = jwtService.generateToken(authentication);
            return ResponseEntity.ok(token);

        }else{
            throw new UsernameNotFoundException("Invalide user request");
        }
    }
    @PostMapping("/register")
        public ResponseEntity<String> addNewUser(@RequestBody User1 userInfo){
            String response = userService.addUser(userInfo);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
