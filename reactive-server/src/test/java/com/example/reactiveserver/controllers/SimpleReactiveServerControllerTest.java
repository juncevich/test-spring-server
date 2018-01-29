package com.example.reactiveserver.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.example.common.model.TestCase;

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
        TestCase responseBody = webTestClient.get().uri("/async/server/test_case").exchange()
                .expectBody(TestCase.class).returnResult().getResponseBody();
        
        assertNotNull(responseBody.getStartTime());
        assertNotNull(responseBody.getEndTime());

    }
}
