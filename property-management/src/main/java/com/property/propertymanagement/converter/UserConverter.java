package com.property.propertymanagement.converter;


import com.property.propertymanagement.dto.PropertyDTO;
import com.property.propertymanagement.dto.UserDTO;
import com.property.propertymanagement.entity.PropertyEntity;
import com.property.propertymanagement.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity convertDTOtoEntity(UserDTO userDTO){

        UserEntity userEnt = new UserEntity();
        user.setPhone(userDTO.getPhone());
        user.setPassword(userDTO.getPassword());
        user.setOwnerEmail(userDTO.getOwnerEmail());
        user.setOwnerName(userDTO.getOwnerName());

        return user;
    }

    public UserDTO convertEntityToDTO(UserEntity userEntity){
        UserDTO propertyDTO =  new UserDTO();
        UserDTO.setId(propertyEntity.getId());
        UserDTO.setTitle(propertyEntity.getTitle());
        UserDTO.setAddress(propertyEntity.getAddress());
        UserDTO.setPrice(propertyEntity.getPrice());
        UserDTO.setDescription(propertyEntity.getDescription());

        return userDTO;
    }

}
