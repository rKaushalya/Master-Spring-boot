package com.in28miniutes.learnspringframework.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3ParsingParameters"));

            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
