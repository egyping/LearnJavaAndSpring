package com.property.propertymanagement.service.impl;

import com.property.propertymanagement.dto.PropertyDTO;
import com.property.propertymanagement.entity.PropertyEntity;
import com.property.propertymanagement.repository.PropertyRepository;
import com.property.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// class to implement the PropertyService

@Service
public class PropertyServiceImpl implements PropertyService {

    // propertyRepository is connected to the DB
    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        // propertyRepository by default it takes (PropertyEntity) we have to convert tht DTO to entity
        // Adapter design patern DTO == Entity
        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setAddress(propertyDTO.getAddress());
        pe.setPrice(propertyDTO.getPrice());
        pe.setDescription(propertyDTO.getDescription());
        propertyRepository.save(pe);
        return null;
    }
}