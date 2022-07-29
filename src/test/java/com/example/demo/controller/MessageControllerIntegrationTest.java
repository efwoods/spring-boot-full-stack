package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MessageControllerIntegrationTest {

    @Test
    void hello(@Autowired TestRestTemplate testRestTemplate) {
        ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/api/messages/hello", String.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(MediaType.valueOf("text/plain;charset=UTF-8"), responseEntity.getHeaders().getContentType());
        String response = responseEntity.getBody();
        if(response != null) {
            assertEquals("Full Stack Java with Spring Boot & VueJS!", response);
        }
    }
}