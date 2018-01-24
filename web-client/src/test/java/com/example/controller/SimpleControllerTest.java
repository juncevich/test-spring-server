package com.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class SimpleControllerTest {

    private MockMvc mockMvc;

    @Before public void setUp() {

        this.mockMvc = MockMvcBuilders.standaloneSetup(new SimpleController()).build();
    }

    @Test public void test() throws Exception {

        this.mockMvc.perform(post("/sync/client/test").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk()).andExpect(content().contentType("application/json;charset=UTF-8"));
    }
}
