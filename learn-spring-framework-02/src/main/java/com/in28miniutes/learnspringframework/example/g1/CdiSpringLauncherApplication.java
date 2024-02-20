package com.in28miniutes.learnspringframework.example.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class Business{
    private DataService dataService;

//    @Autowired
    @Inject
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }
}

//@Component
@Named
class DataService{

}

@Configuration
@ComponentScan
public class CdiSpringLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(CdiSpringLauncherApplication.class);){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
