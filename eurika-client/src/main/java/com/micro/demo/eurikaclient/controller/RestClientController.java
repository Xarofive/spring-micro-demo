package com.micro.demo.eurikaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class RestClientController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/id")
    public String getId() {
        return id;
    }
}
