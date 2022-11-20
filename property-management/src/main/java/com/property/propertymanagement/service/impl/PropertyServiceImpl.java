package com.property.propertymanagement.service.impl;

import com.property.propertymanagement.converter.PropertyConverter;
import com.property.propertymanagement.dto.PropertyDTO;
import com.property.propertymanagement.entity.PropertyEntity;
import com.property.propertymanagement.repository.PropertyRepository;
import com.property.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// class to implement the PropertyService

@Service
public class PropertyServiceImpl implements PropertyService {

    // propertyRepository is connected to the DB
    @Autowired
    private PropertyRepository propertyRepository;

    // Auto wire the converter from DTO to Entity and vice versa
    @Autowired
    private PropertyConverter propertyConverter;

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        // pe is PropertyEntity type
        PropertyEntity pe = propertyConverter.convertDTOtoEntity(propertyDTO);
        // lets save the received DTO in variable pe
        pe = propertyRepository.save(pe);
        // convert the pe entity to DTO
        propertyDTO = propertyConverter.convertEntityToDTO(pe);
        return propertyDTO;
    }

    // getAllproperties impl , it has to return List DTO so the type is  List<PropertyDTO>
    @Override
    public List<PropertyDTO> getAllProperties() {
        // listOfProps holds the values coming from the DB with type of Entity
        List<PropertyEntity> listOfProps = (List<PropertyEntity>)propertyRepository.findAll();
        // propList is new array list with List DTO type
        List<PropertyDTO> propList = new ArrayList<>();
        // we need to convert the entities to DTOs so we will loop one by one, convert then add to proplist
        for(PropertyEntity pe : listOfProps){
            PropertyDTO dto = propertyConverter.convertEntityToDTO(pe);
            propList.add(dto);
        }
        return propList;
    }

    // impl the update
    @Override
    public PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId) {
        // first lets find the exact record using findByID
        // Optional use it at any find so when it return by null doesnt throw error
        // optEnt is boolean
        Optional<PropertyEntity> optEn = propertyRepository.findById(propertyId);
        // dto is the returned value type dto since we want to return dto only
        PropertyDTO dto = null ;
        // now get the object and assign it to pe
        // then set the pe values from whatever coming from the controller in propertyDTO
        if(optEn.isPresent()){
            PropertyEntity pe = optEn.get();
            pe.setTitle(propertyDTO.getTitle());
            pe.setAddress(propertyDTO.getAddress());
            pe.setOwnerName(propertyDTO.getOwnerName());
            pe.setOwnerEmail(propertyDTO.getOwnerEmail());
            pe.setPrice(propertyDTO.getPrice());
            pe.setDescription(propertyDTO.getDescription());
            dto = propertyConverter.convertEntityToDTO(pe);
            // now save the pe to the db
            propertyRepository.save(pe);
        }
        return dto;
    }

    // update only description
    @Override
    public PropertyDTO updatePropertyDescription(PropertyDTO propertyDTO, Long propertyId) {
        // find by id in the db and assign the row data to optEn
        Optional<PropertyEntity> optEn =  propertyRepository.findById(propertyId);
        // create empty dto to update it later
        PropertyDTO dto = null;
        if(optEn.isPresent()){
            // get the entire row from the DB and assign it to pe
            PropertyEntity pe = optEn.get();
            // update the pe description by the data coming from the dto
            pe.setDescription(propertyDTO.getDescription());
            // convert entity to dto so we can respond back to the controller
            dto = propertyConverter.convertEntityToDTO(pe);
            // save entity pe to the db
            propertyRepository.save(pe);
        }
        return dto;
    }

    @Override
    public PropertyDTO updatePropertyPrice(PropertyDTO propertyDTO, Long propertyId) {
        Optional<PropertyEntity> optEn =  propertyRepository.findById(propertyId);
        PropertyDTO dto = null;
        if(optEn.isPresent()){
            PropertyEntity pe = optEn.get();//data from database
            pe.setPrice(propertyDTO.getPrice());
            dto = propertyConverter.convertEntityToDTO(pe);
            propertyRepository.save(pe);
        }
        return dto;
    }

    @Override
    public void deleteProperty(Long propertyId) {
        propertyRepository.deleteById(propertyId);
    }


}