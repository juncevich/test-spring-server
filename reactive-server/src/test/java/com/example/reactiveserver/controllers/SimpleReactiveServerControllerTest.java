package com.example.reactiveserver.controllers;

import java.time.Instant;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.reactive.server.WebTestClient;

public class SimpleReactiveServerControllerTest {

    private WebTestClient webTestClient;
    SimpleReactiveServerController simpleReactiveServerController;
    @Before public void setUp() {

         simpleReactiveServerController =
                new SimpleReactiveServerController();
        webTestClient = WebTestClient.bindToController(simpleReactiveServerController).build();
    }

    @Test public void getTestMessage() {

        webTestClient.get().uri("/async/server/test").exchange().expectStatus().isOk();
    }

    @Test public void testTestCaseResponse() {

//        BDDMockito.given(simpleReactiveServerController.getTestCaseMessage()).willReturn(
//                just(TestCase.builder().startTime(Instant
//                        .now()).build().getDurationTime()));
//        
//        
        webTestClient.get().uri("/async/server/test_case").exchange().expectBody(Instant.class).returnResult();

    }
}
