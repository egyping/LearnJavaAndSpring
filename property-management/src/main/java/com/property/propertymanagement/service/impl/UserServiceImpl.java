package com.property.propertymanagement.service.impl;

import com.property.propertymanagement.converter.UserConverter;
import com.property.propertymanagement.dto.UserDTO;
import com.property.propertymanagement.entity.UserEntity;
import com.property.propertymanagement.exception.BusinessException;
import com.property.propertymanagement.exception.ErrorModel;
import com.property.propertymanagement.repository.UserRepository;
import com.property.propertymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    // 1- get the User repository so we can interact with the DB
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public UserDTO register(UserDTO userDTO) {
        UserEntity userEntity = userConverter.convertDTOtoEntity(userDTO);
        userEntity =  userRepository.save(userEntity);
        userDTO = userConverter.convertEntityToDTO(userEntity);
        return userDTO;
    }

    @Override
    public UserDTO login(String email, String password) {
        UserDTO userDTO = null;
        Optional<UserEntity>  optionalUserEntity =  userRepository.findByOwnerEmailAndPassword(email, password);
        if (optionalUserEntity.isPresent()){
            userDTO = userConverter.convertEntityToDTO(optionalUserEntity.get());
        }else{

            List<ErrorModel> errorModelList = new ArrayList<>();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setCode("INVALID_LOGIN");
            errorModel.setMessage("Incorrect Email or Password");
            errorModelList.add(errorModel);

            throw new BusinessException(errorModelList);
        }
        return userDTO;
    }
}
