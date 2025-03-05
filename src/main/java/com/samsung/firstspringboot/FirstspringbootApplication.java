package com.samsung.firstspringboot;

import com.samsung.firstspringboot.Common.IRServiceConfigurations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class FirstspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstspringbootApplication.class, args);
    }

}
