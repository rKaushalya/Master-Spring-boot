package com.in28miniutes.learnspringframework.example.f1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class PerPostAnnotationContextLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PerPostAnnotationContextLauncherApplication.class);){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
