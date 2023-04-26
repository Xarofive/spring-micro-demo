package com.micro.demo.eurikaclientsecond.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class ClientRestController {

    @GetMapping("/name")
    public String getClientName() {
        return "second client";
    }
}
