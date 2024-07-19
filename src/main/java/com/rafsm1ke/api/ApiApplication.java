package com.rafsm1ke.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class ApiApplication {

    @Bean(name="entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory() {
        return new LocalSessionFactoryBean();
    }

    public static void main(String[] args) {

        SpringApplication.run(ApiApplication.class, args);
    }

}
