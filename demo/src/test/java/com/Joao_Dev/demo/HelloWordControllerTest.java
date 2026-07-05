package com.Joao_Dev.demo;

import com.Joao_Dev.demo.controller.HelloWordController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HelloWordControllerTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoadsAndControllerIsRegistered() {
        assertThat(applicationContext).isNotNull();
        assertThat(applicationContext.getBean(HelloWordController.class)).isNotNull();
    }
}
