package com.property.propertymanagement.service;

import com.property.propertymanagement.dto.PropertyDTO;

import java.util.List;

public interface PropertyService {

    // interface method to save the property
    // interface methods are public by default
    PropertyDTO saveProperty(PropertyDTO propertyDTO);

    List<PropertyDTO> getAllProperties();

    // update property , type which will be returned and operated is PropertyDTO
    // her we have to pass the id and id type
    PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId);
}
