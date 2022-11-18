package com.property.propertymanagement.converter;

import com.property.propertymanagement.dto.PropertyDTO;
import com.property.propertymanagement.entity.PropertyEntity;
import org.springframework.stereotype.Component;

// Class to convert the DTO to Entity
// convertDTOtoEntity will return PropertyEntity data type
@Component
public class PropertyConverter {

    public PropertyEntity convertDTOtoEntity(PropertyDTO propertyDTO){

        // propertyRepository by default it takes (PropertyEntity) we have to convert tht DTO to entity
        // Adapter design patern DTO == Entity
        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setAddress(propertyDTO.getAddress());
        pe.setPrice(propertyDTO.getPrice());
        pe.setDescription(propertyDTO.getDescription());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setOwnerName(propertyDTO.getOwnerName());

        return pe;
    }

    public PropertyDTO convertEntityToDTO(PropertyEntity propertyEntity){
        PropertyDTO propertyDTO =  new PropertyDTO();
        propertyDTO.setId(propertyEntity.getId());
        propertyDTO.setTitle(propertyEntity.getTitle());
        propertyDTO.setAddress(propertyEntity.getAddress());
        propertyDTO.setPrice(propertyEntity.getPrice());
        propertyDTO.setDescription(propertyEntity.getDescription());

        return propertyDTO;
    }

}
