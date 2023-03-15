package br.com.viptech.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// As três anotações são substituidas por @SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
//@Configuration
@SpringBootApplication
public class ApplicationStart {
    public static void main(String[] arg){
        SpringApplication.run(ApplicationStart.class, arg);
    }
}