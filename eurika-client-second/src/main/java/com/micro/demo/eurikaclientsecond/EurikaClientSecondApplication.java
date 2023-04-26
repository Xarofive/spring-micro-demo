package com.micro.demo.eurikaclientsecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurikaClientSecondApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurikaClientSecondApplication.class, args);
    }
}
