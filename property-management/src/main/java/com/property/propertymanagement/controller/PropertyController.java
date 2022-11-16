package com.property.propertymanagement.controller;

import com.property.propertymanagement.dto.PropertyDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PropertyController {

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello Hellooo";
    }

    // Adding property
    @PostMapping("/properties")
    public PropertyDTO saveProperty(@RequestBody PropertyDTO propertyDTO){
        System.out.println(propertyDTO);
        return propertyDTO;
    }
}
