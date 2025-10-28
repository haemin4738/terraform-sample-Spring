package com.back;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CdExampleApplication {

    @Value("${custom.secret.key}")
    private String secretKey;

    public static void main(String[] args) {
        SpringApplication.run(CdExampleApplication.class, args);
    }

}
