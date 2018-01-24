package com.example.reactiveserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class SimpleReactiveServerController {

    @GetMapping("/async/server/test") Mono<String> getTestMessage(){
        return Mono.just("Test message");
    }
}
