package com.sds.back_end.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DataController {
    
    @GetMapping("/hello")
    public String home() {
        return "Hello world";
    }

    @PostMapping("/join")
    public String join(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    
}
