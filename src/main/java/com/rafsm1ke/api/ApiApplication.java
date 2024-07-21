package com.rafsm1ke.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Swagger - Spring Boot JPA Workshop", description = "API - Sistema de gerenciamento de usuarios e pedidos, desenvolvida para estudo de caso | Spring Boot 3 e JPA"))
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApiApplication.class, args);
    }

}
