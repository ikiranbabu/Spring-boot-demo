package com.luv2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.luv2code")
@EntityScan("com.luv2code.config.*")
@EnableJpaRepositories("com.luv2code.dao")
@PropertySource("classpath:application.properties")

public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
	
  
}
