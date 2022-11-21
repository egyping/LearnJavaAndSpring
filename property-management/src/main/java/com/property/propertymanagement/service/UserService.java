package com.property.propertymanagement.service;

import com.property.propertymanagement.dto.UserDTO;
import org.apache.catalina.User;

public interface UserService {

    // register service it will return the UserDTO for that reason the type is UserDTO
    // it takes the userDTO model from the request
    UserDTO register(UserDTO userDTO);

    // will return UserDTO type on successful login
    UserDTO login(String email, String password);


}
