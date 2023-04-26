package com.micro.demo.eurikaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class RestClientController {
    @GetMapping("/test")
    public String test() {
        return "zzzzzzzzzzzzzzzzz";
    }
}
