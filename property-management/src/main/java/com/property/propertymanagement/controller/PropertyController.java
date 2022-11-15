package com.property.propertymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class PropertyController {

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello Hellooo";
    }
}
