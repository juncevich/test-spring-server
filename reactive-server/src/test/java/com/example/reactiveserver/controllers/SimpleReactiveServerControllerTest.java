package com.example.reactiveserver.controllers;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.example.common.model.TestCase;

public class SimpleReactiveServerControllerTest {

    private WebTestClient webTestClient;

    private SimpleReactiveServerController simpleReactiveServerController;

    @Before public void setUp() {

        simpleReactiveServerController = new SimpleReactiveServerController();
        webTestClient = WebTestClient.bindToController(simpleReactiveServerController).build();
    }

    @Test public void getTestMessage() {

        webTestClient.get().uri("/async/server/test").exchange().expectStatus().isOk();
    }

    @Test public void testTestCaseResponse() {

        webTestClient.get().uri("/async/server/test").exchange().expectBody(TestCase.class);

    }
}
