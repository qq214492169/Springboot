package com.wisely.ch5_2_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch522Application {

    @Value("${boot.author}")
    private String bootAuthor;
    @Value("${boot.name}")
    private String bootName;

    @RequestMapping("/")
    String index() {
        return "bootAuthor is " + bootAuthor + " bootName is " + bootName;
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch522Application.class, args);
    }

}
