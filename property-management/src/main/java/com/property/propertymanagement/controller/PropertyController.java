package com.property.propertymanagement.controller;

import com.property.propertymanagement.dto.PropertyDTO;
import com.property.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello Hellooo";
    }

    // Adding property
    @PostMapping("/properties")
    public PropertyDTO saveProperty(@RequestBody PropertyDTO propertyDTO){
        // here we will save in DB plus we pass the value to var propertyDTO so we can use it
        // at the response
        propertyDTO = propertyService.saveProperty(propertyDTO);
        // System.out.println(propertyDTO);

        // Return the response using the ResponseEntity class
        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(
                propertyDTO, HttpStatus.CREATED);
        return responseEntity.getBody();
    }

    // Return all properties in the DB
    // We need to return list DB Data + form the http response by response entity
    // so the type is ResponseEntity<List<PropertyDTO>> list because its list
    @GetMapping("/properties")
    public ResponseEntity<List<PropertyDTO>> getAllProperties(){
        // propertyList is list variable coming from getAllProperties interface
        List<PropertyDTO> propertyList = propertyService.getAllProperties();
        // responseEntity hold the value of the propertyList with OK status type
        ResponseEntity<List<PropertyDTO>> responseEntity = new ResponseEntity<>(propertyList, HttpStatus.OK);
        return responseEntity;
    }

    // Update property
    @PutMapping("/properties/{propertyId}")
    public ResponseEntity<PropertyDTO> updateProperty(
            @RequestBody PropertyDTO propertyDTO, @PathVariable Long propertyId){
        // get the DTO value from the impl service
        propertyDTO = propertyService.updateProperty(propertyDTO, propertyId);
        // create response entity from the returned dto and return the response entity
        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.OK);
        return responseEntity;
    }

    @PatchMapping("/properties/update-description/{propertyId}")
    public ResponseEntity<PropertyDTO> updatePropertyDescription(
            @RequestBody PropertyDTO propertyDTO, @PathVariable Long propertyId){
        propertyDTO = propertyService.updatePropertyDescription(propertyDTO, propertyId);
        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.OK);
        return responseEntity;
    }

    @PatchMapping("/properties/update-price/{propertyId}")
    public ResponseEntity<PropertyDTO> updatePropertyPrice(@RequestBody PropertyDTO propertyDTO, @PathVariable Long propertyId){
        propertyDTO = propertyService.updatePropertyPrice(propertyDTO, propertyId);
        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.OK);
        return responseEntity;
    }

    @DeleteMapping("/properties/{propertyId}")
    public ResponseEntity deleteProperty(@PathVariable Long propertyId){
        propertyService.deleteProperty(propertyId);
        ResponseEntity<Void> responseEntity = new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        return responseEntity;
    }
}
