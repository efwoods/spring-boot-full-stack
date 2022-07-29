package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageControllerUnitTest {

    @Test
    void hello() {
        MessageController messageController = new MessageController();
        String result = messageController.hello();
        assertAll( "hello result",
            () -> assertEquals("Full Stack Java with Spring Boot & VueJS!", result)
        );

    }
}