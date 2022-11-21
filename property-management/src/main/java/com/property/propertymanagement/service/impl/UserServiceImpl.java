package com.property.propertymanagement.service.impl;

import com.property.propertymanagement.dto.UserDTO;
import com.property.propertymanagement.repository.UserRepository;
import com.property.propertymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    // 1- get the User repository so we can interact with the DB
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO register(UserDTO userDTO) {

        userRepository.save()
        return null;
    }

    @Override
    public UserDTO login(String email, String password) {
        return null;
    }
}
