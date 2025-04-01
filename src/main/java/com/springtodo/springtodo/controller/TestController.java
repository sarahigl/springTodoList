package com.springtodo.springtodo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/testeur")
        public String test(){
            return "test";
        }

}
