package com.example.reactiveserver.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.reactive.server.WebTestClient;

public class SimpleReactiveServerControllerTest {

    private WebTestClient webTestClient;

    private SimpleReactiveServerController simpleReactiveServerController;

    @Before public void setUp() {

        webTestClient = WebTestClient.bindToController(simpleReactiveServerController).build();
    }

    @Test public void getTestMessage() {

        webTestClient.get().uri("/async/server/test").exchange().expectStatus().isOk();
    }
}
