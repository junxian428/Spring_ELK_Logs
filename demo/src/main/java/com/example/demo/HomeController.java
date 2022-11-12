package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {
    
    @GetMapping("/")
    public String HomePage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Welcome home page " + localDateTime);
        return "Welcome SpringBoot";
    }

    @GetMapping("/logs")
    public String LogsPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("This Logs page" + localDateTime);
        return "Welcome to logs page";
    }
}
