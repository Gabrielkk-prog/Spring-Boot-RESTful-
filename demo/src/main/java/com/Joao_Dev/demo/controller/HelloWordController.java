package com.Joao_Dev.demo.controller;

import com.Joao_Dev.demo.domain.User;
import com.Joao_Dev.demo.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    private final HelloWorldService helloWorldService;

    public HelloWordController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/")
    public String home() {
        return helloWorldService.getMessage();
    }

    @GetMapping("/hello")
    public String hello() {
        return helloWorldService.getMessage();
    }

    @PostMapping("/post")
    public String helloworldpost(@RequestBody User body) {
        return "hello World " + body.getName();
    }
}