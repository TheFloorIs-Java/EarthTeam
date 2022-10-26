package com.revature.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * Test to confirm order api returns 200 status
     */
    @Test
    public void getOrderShouldReturnStatusOk() throws Exception {
        mockMvc.perform(get("/api/order/")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(200));
    }
}