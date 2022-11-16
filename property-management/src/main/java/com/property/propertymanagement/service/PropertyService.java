package com.property.propertymanagement.service;

import com.property.propertymanagement.dto.PropertyDTO;

public interface PropertyService {

    // interface method to save the property
    public PropertyDTO saveProperty(PropertyDTO propertyDTO);
}
