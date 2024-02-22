package com.worametrics.restApi.restfulwebservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld(){
        return "Hello World.!";
    }


        @GetMapping(path = "/hello-world/path-variable/{name}")
        public String helloWorldPathVariable(@PathVariable String name){
            return name;
        }
}
