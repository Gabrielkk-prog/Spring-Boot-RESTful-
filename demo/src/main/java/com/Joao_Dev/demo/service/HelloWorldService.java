package com.Joao_Dev.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    private final String message;

    public HelloWorldService(String appMessage) {
        this.message = appMessage;
    }

    public String getMessage() {
        return message;
    }
}
