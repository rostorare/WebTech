package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired
    MyService service;

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping(path="/answer/{name}/{age}")
    public String pathParams(@PathVariable("name") String name,
                             @PathVariable ("age") String age) {
        return String.format("%s is %s years old", name, age);
    }

    @RequestMapping("/answer")
    public String queryParams(@RequestParam("name")String name,
                              @RequestParam("age")String age)
    {
        return String.format("%s is %s years old", name, age);
    }

}

