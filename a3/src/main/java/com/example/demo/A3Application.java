package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.a1.*","com.example.demo.a2.*","com.test.demo.*","com.github.olingo.example.*"})
@EntityScan(basePackages = {"com.example.demo.a1.entity","com.test.demo.entity","com.github.olingo.example.entity"})
//@EnableJpaRepositories(basePackages = {"com.example.demo.a1.repo.*","com.test.demo.repo.*"})
public class A3Application {

	public static void main(String[] args) {
		SpringApplication.run(A3Application.class, args);
	}

}
