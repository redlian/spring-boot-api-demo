package com.redlian.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    public String hel() {
        return "demo iis";
    }

    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}