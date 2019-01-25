package com.dubbo.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:providers.xml"})
public class GeneratorApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(GeneratorApplicationRun.class,args);
    }
}
