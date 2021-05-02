package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WichtelRestController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/Event")
    public String EventName(){
        return "ZE WAURDO";
    }

    @RequestMapping("/blo")
    public String jojo(){
        return "ZE Wasdfasdfasdf";
    }

}