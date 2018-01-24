package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @PostMapping("/sync/client/test")
    public String test(){
      return "string";  
    }
}
