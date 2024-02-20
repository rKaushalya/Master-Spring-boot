package com.in28miniutes.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city){
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ravindu";
    }

    @Bean
    public int age(){
        return 18;
    }

    @Bean
    public Person person(){
        return new Person("ravi", 20, new Address("Wanduramba", "Galle"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(),address());
    }

    @Bean
    public Person person3ParsingParameters(String name, int age, Address address2){
        return new Person(name, age,address2);
    }

    @Bean
    public Person person4ParsingParameters(String name, int age,@Qualifier("qualifier") Address address){
        return new Person(name, age,address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Wanduramba", "Galle");
    }

    @Bean(name = "address3")
    @Qualifier("qualifier")
    public Address address3(){
        return new Address("batapola", "Galle");
    }
}
