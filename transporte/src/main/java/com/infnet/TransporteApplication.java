package com.infnet;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class TransporteApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransporteApplication.class, args);
    }
}