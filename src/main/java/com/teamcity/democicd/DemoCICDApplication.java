package com.teamcity.democicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoCICDApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCICDApplication.class, args);
    }

    @GetMapping(value = "/api/v1/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> demoHelloWorld() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}
