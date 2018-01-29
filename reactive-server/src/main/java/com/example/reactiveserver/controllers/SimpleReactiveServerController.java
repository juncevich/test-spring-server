package com.example.reactiveserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.model.TestCase;

import reactor.core.publisher.Mono;

@RestController public class SimpleReactiveServerController {

    @GetMapping("/async/server/test") Mono<String> getTestMessage() {

        return Mono.just("Test message");
    }

    @GetMapping("/async/server/test_case") Mono<TestCase> getTestCaseMessage() {

        TestCase testCase = TestCase.builder().build();
        testCase.initStartTime();
        testCase.getDurationTime();
        return Mono.just(testCase);
    }
}
