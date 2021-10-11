package com.example.springbootclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootclientApplication.class, args);
    }

}
