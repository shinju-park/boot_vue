package com.sds.back_end.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {
    
    @GetMapping("/")
    public String home() {
        return "Data 준비중";
    }
    
}
