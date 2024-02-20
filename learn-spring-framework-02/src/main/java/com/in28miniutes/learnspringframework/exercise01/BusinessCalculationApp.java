package com.in28miniutes.learnspringframework.exercise01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessCalculationApp {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(BusinessCalculationApp.class);){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
