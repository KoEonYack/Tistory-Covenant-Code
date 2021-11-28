package com.covenant.springehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringEhcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEhcacheApplication.class, args);
    }

}
